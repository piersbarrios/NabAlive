package com.nabalive.data.core.dao;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.google.common.base.Function;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.mongodb.MongoClient;
import com.nabalive.data.core.model.ApplicationStore;
import com.nabalive.data.core.model.Nabaztag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: Julien Cheype
 * Date: 11/16/11
 */
@Component("applicationStoreDAO")
public class ApplicationStoreDAO extends BasicDAO<ApplicationStore, ObjectId> {
    @Autowired
    public ApplicationStoreDAO(Morphia morphia, MongoClient mongo, @Value("${mongo.database}") String database) {
        super(mongo, morphia, database);
        getDatastore().ensureIndexes();
    }
}
