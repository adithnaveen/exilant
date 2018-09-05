package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmpRecord {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		DB db = mongoClient.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		
		// first way 
		DBObject object = new BasicDBObject(); 
		object.put("empid", 301); 
		object.put("empname", "Kavitha"); 
		object.put("email", "kavitha@gmail.com"	); 
		object.put("empsal", 30000); 
		
	// 	dbc.save(object); 
		
		
		// second way 
		Map<String, Object> map = new HashMap<>(); 
		
		map.put("empid", 302); 
		map.put("empname", "Rupa"); 
		map.put("empemail", "rupa@exilant.com"); 
		map.put("empsal", 34000); 
		
//		dbc.save(new BasicDBObject(map)); 
		

		// third way - store the given JSON  
		String jsonString = "{empid:303, empnam:'siddhart', "
				+ "empemail:'siddharth@gmail.com', empsal:3434}"; 
		
//		dbc.save((DBObject)JSON.parse(jsonString));
		
		
		// fourth way -- store the bean directly 
		
		Employee employee = new Employee(); 
		employee.setEmpId(304);
		employee.setEmpName("Anuj");
		employee.setEmpSal(45454);
		employee.setEmpEmail("anuj@gmail.com");
		
		dbc.save(employee); 
		
		System.out.println("Object Saved... ");
	}
}








