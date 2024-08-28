package com.ericsson.eniq.events.ui.shared.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 10/02/12
 * Time: 08:26
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ResultSetMappingInfo {
    FieldMappingInfo[] fieldMappings();
}
