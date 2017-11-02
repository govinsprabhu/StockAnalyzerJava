package com.govind.sample.util;

import javax.ws.rs.NameBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by 609600403 on 12/03/2016.
 */


@NameBinding
@Retention(value = RetentionPolicy.RUNTIME)
public @interface JsonMapping {

}
