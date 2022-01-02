package com.epam.learn.test;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MongoDBTest {

    @Test
    public void shouldGetCorrectURL () {
      ConnectionString connectionString = new ConnectionString(
          "mongodb+srv://admin:epamlearn@cluster0.zkgxh.mongodb.net/?retryWrites=true&w=majority");
      MongoClientSettings settings = MongoClientSettings.builder()
          .applyConnectionString(connectionString)
          .build();
      MongoClient mongoClient = MongoClients.create(settings);
      MongoDatabase database = mongoClient.getDatabase("sample_training");
      MongoCollection<Document> gradesCollection = database.getCollection("companies");
      Document student1 = gradesCollection.find(new Document("name", "Facebook")).first();
      Assert.assertEquals(student1.get("homepage_url"), "http://facebook.com");
    }
}
