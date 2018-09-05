package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// localhost port:27017 
		MongoClient mongoClient = new MongoClient("localhost", 27017); 
		
		System.out.println("Connection Got to " + 
				mongoClient);
		
		System.out.println("List of DBS from Mongo:");
		
		for(String dbName : mongoClient.getDatabaseNames()) {
			System.out.println("\t" + dbName);
			
			DB db = mongoClient.getDB(dbName); 
			
			for(String collectionName : db.getCollectionNames()) {
				System.out.println("\t\t" + collectionName);
				
			}
			
			
		}
		
	}
}
