package com.govind.sample.util;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by 609600403 on 02/10/2017.
 */
public class QueryUtil {
    public static Query getQuery(Criteria query){
        return Query.query(query);
    }


    public static Query getCredentials(String username){
        Criteria criteria = Criteria.where("username").is(username);
        return new Query(criteria);
    }

}
