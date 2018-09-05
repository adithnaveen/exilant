package com.training.sparkworks;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.bson.Document;

import com.mongodb.spark.MongoSpark;
import com.mongodb.spark.rdd.api.java.JavaMongoRDD;

public final class ReadFromMongoDB {

  public static void main(final String[] args) throws InterruptedException {
		Logger.getLogger("org").setLevel(Level.ERROR);
		// optional 
		Logger.getLogger("akka").setLevel(Level.ERROR);
		
		
    SparkSession spark = SparkSession.builder()
      .master("local")
      .appName("MongoSparkConnectorIntro")
      .config("spark.mongodb.input.uri",
    		  "mongodb://127.0.0.1/exdb.emps")
//      .config("spark.mongodb.output.uri", "mongodb://127.0.0.1/exdb.emps")
      .getOrCreate();

    // Create a JavaSparkContext using the SparkSession's SparkContext object
    JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());

    /*Start Example: Read data from MongoDB************************/
    JavaMongoRDD<Document> rdd = MongoSpark.load(jsc);
    /*End Example**************************************************/

    // Analyze data from MongoDB
    System.out.println(rdd.count());
    System.out.println(rdd.first().toJson());
    rdd.collect().forEach(System.out :: println);
    jsc.close();

  }
}