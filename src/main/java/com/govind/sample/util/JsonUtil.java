package com.govind.sample.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

/**
 * Created by 609600403 on 12/03/2016.
 */

@JsonMapping
public final class JsonUtil {

    private JsonUtil(){

    }

    @ToJson
    public static String toJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector(TypeFactory.defaultInstance()));
        return objectMapper.writeValueAsString(object);
    }

    @FromJson
    public static <T>T fromJson(final String json, final Class<T> type) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector(TypeFactory.defaultInstance()));
        return objectMapper.readValue(IOUtils.toByteArray(json),type);
    }

}
