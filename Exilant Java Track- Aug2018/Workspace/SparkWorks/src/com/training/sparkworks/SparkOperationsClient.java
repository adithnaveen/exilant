package com.training.sparkworks;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.DoubleFunction;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnection;
import com.training.commons.Utilities;

public class SparkOperationsClient {
	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);
		// optional 
		Logger.getLogger("akka").setLevel(Level.ERROR);
		
		JavaSparkContext sparkContext = 
				SparkConnection.getContext(); 
		
		// start loading the data
		
		// 1. load the collection and cache it 
		JavaRDD<Integer> collData = DataSource.getCollData(); 
		System.out.println("Total Number Of Records : " 
				+collData.count());
		
		
		// 2. load the file and cache it 
		JavaRDD<String> autoDataContent  = 
			sparkContext.textFile("./data/auto-data.csv"); 
		
		// to know number of records 
		
		System.out.println("Number Of Records"  + 
				autoDataContent.count());
		
		// printing 5 lines of data 
		
		System.out.println("Loading data from File");
	
		Utilities.printStringRDD(autoDataContent, 10);
		
		// storing RDD's 
		/*autoDataContent.saveAsTextFile
			("data/auto-data-modified.csv");*/
		
		
		// Spark Transformation 
		// convertion from CSV to TSV 
		
		System.out.println("TSV Format... ");
		JavaRDD<String> tsvData = autoDataContent
				.map(str -> str.replace(",", "\t")); 
		
		Utilities.printStringRDD(tsvData, 5);
		
		///////////////////FILTER EXAMPLE/////////////
		// to remove header 
		
		String header = autoDataContent.first(); 
		
		JavaRDD<String> autoDataWithOutHeader = 
			autoDataContent.filter(s -> !s.equals
					(header)); 
		
		Utilities.printStringRDD(
				autoDataWithOutHeader, 5);

		//////// filter those records which 
		// has only "toyota"
		
		JavaRDD<String> toyotaData = 
			autoDataContent.filter(str -> 
				str.contains("toyota")); 
		
		System.out.println("--- Only Toyota Vehicles------");
		Utilities.printStringRDD(toyotaData, 10);
		
		
		// to count number of words in the given RDD 
		System.out.println("Using flat map ");
		
		JavaRDD<String> words = 
				toyotaData.flatMap(new FlatMapFunction<String, String>() {

					@Override
					public Iterator<String> call(String t) throws Exception {
						// TODO Auto-generated method stub
						return Arrays.asList(t.split(",")).iterator(); 
					}
				}); 
		
		System.out.println("ToyotaRDD Word Count : " + 
				words.count());
		
		// after cleansing the data 
		System.out.println("****** After Clensing Data **********");
		
		JavaRDD<String> cleanseRDD = autoDataContent
				.map(new ClenseRDDCars()); 

		Utilities.printStringRDD(cleanseRDD, 5);
		
		
		
		// Set Operations 
		JavaRDD<String> words1 = sparkContext.parallelize(
				Arrays.asList("hello", "how", "are", "you", "today")
				); 
		
		JavaRDD<String> words2 = sparkContext.parallelize(
				Arrays.asList("hello", "how", "were", "yesterday")
				); 
		
		System.out.println("Union operations - Set");
		Utilities.printStringRDD(words1.union(words2), 9);
		
		System.out.println("Intersection Operations  Set");
		Utilities.printStringRDD(words1.intersection(words2), 9);
		
		// find sum of number in the given RDD 

		// 3,4,56,43,2,66,77,23 = 274
		Integer collDataCount = collData.reduce((x, y) -> x+y); 
		System.out.println("Sum of Given Integers  " + collDataCount);
		
//		[MAKE, FUELTYPE, ASPIRE, 4, BODY, DRIVE, CYLINDERS, HP, RPM, MPG-CITY, MPG-HWY, PRICE]
//		[subaru, gas, std, 2, HATCHBACK, fwd, four, 69, 4900, 31, 36, 5118]
//		[chevrolet, gas, std, 2, HATCHBACK, fwd, three, 48, 5100, 47, 53, 5151]

		// on hold will fix by tea break 
//		JavaRDD<Integer> totalMMG = 
	//		autoDataWithOutHeader.reduce(f)

		// Use external function to compute Average MPG
		String totMPG = autoDataWithOutHeader.reduce(new MPGWorks());
		System.out.println("Average MPG is " + 
				(Integer.valueOf(totMPG) / 
						(autoDataWithOutHeader.count() )));
		
		
	}
}







