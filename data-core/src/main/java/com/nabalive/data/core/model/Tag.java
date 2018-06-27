package com.nabalive.data.core.model;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Indexed;

/**
 * Created by IntelliJ IDEA.
 * User: Julien Cheype
 * Date: 12/21/11
 */

@Embedded
public class Tag {
    private String name;
    @Indexed
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
