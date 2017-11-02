package com.govind.sample.service;

import com.govind.sample.payload.Credentials;
import com.govind.sample.payload.Sectors;
import com.govind.sample.payload.User;
import com.govind.sample.util.ToJson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by 609600403 on 10/03/2016.
 */

@Path("/")
public interface Application {

    @Path("name/{id}")
    @GET
    @ToJson
    @Produces("application/json")
    User getUser(@PathParam("id") int id);

    @Path("validate")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    Response validateUsernamePassword(Credentials credentials);

    @Path("all")
    @GET
    @ToJson
    @Produces("application/json")
    List<Sectors> getAll();

}
