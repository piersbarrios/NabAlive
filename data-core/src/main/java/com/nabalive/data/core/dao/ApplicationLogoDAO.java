package com.nabalive.data.core.dao;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;
import com.nabalive.data.core.model.ApplicationLogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Julien Cheype
 * Date: 11/30/11
 */

@Component("applicationLogoDAO")
public class ApplicationLogoDAO extends BasicDAO<ApplicationLogo, String> {
    @Autowired
    public ApplicationLogoDAO(Morphia morphia, MongoClient mongo, @Value("${mongo.database}") String database) {
        super(mongo, morphia, database);
        getDatastore().ensureIndexes();
    }
}
