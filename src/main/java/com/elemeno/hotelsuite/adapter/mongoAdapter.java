package com.elemeno.hotelsuite.adapter;

import com.mongodb.client.*;
import com.elemeno.hotelsuite.DBCollections;
import org.bson.Document;


/**
 * MongoAPI - Class created to handle interactions with MongoDB database
 */
public class mongoAdapter {

    MongoClient _mongoClient;
    MongoDatabase _mongoDatabase;

    public mongoAdapter() {
        _mongoClient = createConnection();
        _mongoDatabase = _mongoClient.getDatabase("hotelsuite");
    }

    /**
     * Connect to local instance in secured mode, modify URI to change
     * accessing user and DB
     */
    private MongoClient createConnection() {
        String uri = "mongodb+srv://su:alp1n3@elemenodb.y8hu03f.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        System.out.println("--- MONGODB CONNECTED --- " + mongoClient.getClusterDescription());
        return mongoClient;
    }

    public MongoCollection<Document> getCollection(Enum<DBCollections> collection) {
        return _mongoDatabase.getCollection(collection.toString());
    }

    public void newCollection() {
        _mongoDatabase.createCollection("test");
    }
}
