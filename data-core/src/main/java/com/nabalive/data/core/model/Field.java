package com.nabalive.data.core.model;

import org.mongodb.morphia.annotations.Embedded;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Julien Cheype
 * Date: 12/1/11
 */

@Embedded
public class Field {
    static enum Type{
        INPUT, SELECT, CHECKBOX
    }

    @NotNull
    private Type type;

    @NotNull
    private String label;

    @NotNull
    private String name;

    @NotNull
    private Map<String,String> values = new HashMap<String, String>();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String,String> getValues() {
        return values;
    }

    public void setValues(Map<String,String> values) {
        this.values = values;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
