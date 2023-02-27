package com.elemeno.hotelsuite;

import com.elemeno.hotelsuite.adapter.mongoAdapter;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Start {
    public static void main(String[] args) {
        mongoAdapter db = new mongoAdapter();
        MongoCollection<Document> hotel = db.getCollection(DBCollections.tb_hotel);

        System.out.println(db);
        db.newCollection();
        System.out.println("imported");
    }
}