package com.govind.sample.service;

import com.govind.sample.payload.Company;
import com.govind.sample.payload.Credentials;
import com.govind.sample.payload.Sectors;
import com.govind.sample.payload.User;
import com.govind.sample.util.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by 609600403 on 10/03/2016.
 */

@Service
public class ApplicationImpl implements Application {
    private final Logger logger = LoggerFactory.getLogger(ApplicationImpl.class);

    @Autowired
    MongoOperations mongoOperation;

    @Override
    public User getUser(int id) {
        logger.debug("Incoming id :{}", id);
        User user = new User("mkyong", "password123");
        mongoOperation.save(user);
        // now user object got the created id.
        System.out.println("1. user : " + user);

        // query to search user
        Query searchUserQuery = new Query(Criteria.where("username").is("mkyong"));

        // find the saved user again.

        User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
        System.out.println("2. find - savedUser : " + savedUser);
        return user;
    }

    public Response validateUsernamePassword(Credentials incomingCredentials) {
        String username = incomingCredentials.getUsername();
        String password = incomingCredentials.getPassword();
        System.out.println("username : " + username + " password " + password);
        logger.debug("Username  :{} and password :{} ", username, password);
        // find the saved user again.

        Credentials credentials = mongoOperation.findOne(QueryUtil.getCredentials(username), Credentials.class);

        if (credentials == null) {
            System.out.println("Credentials is null. Password is not valid ");
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity("Not a valid passoword").build();
        }
        System.out.println(credentials);
        if (password.equals(credentials.getPassword())) {
            System.out.println("Success!.. Passoword validated. ");
            return sendOKResponse(Response.Status.OK.toString());
        }

        return Response.status(Response.Status.NOT_ACCEPTABLE).entity("Not a valid passoword").build();
    }

    private static Response sendOKResponse(String jsonString) {
        return Response.ok(jsonString).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept,  authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600").build();
    }

    @Override
    public List<Sectors> getAll() {
        Query query = new Query().with(new Sort("sectorName", "-1"));
        List<Sectors> sectors  = mongoOperation.find(query, Sectors.class);
        System.out.println(sectors);
        return sectors;
    }
}
