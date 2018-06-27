package com.nabalive.data.core.factory;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.ValidationExtension;

/**
 * Created by IntelliJ IDEA.
 * UserDAO: Julien Cheype
 * Date: 6/1/11
 */
public class MorphiaFactoryBean {
    private String packageName;

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Morphia createInstance(){
        Morphia morphia = new Morphia();
        new ValidationExtension(morphia);
        return morphia.mapPackage(packageName);
    }
}
