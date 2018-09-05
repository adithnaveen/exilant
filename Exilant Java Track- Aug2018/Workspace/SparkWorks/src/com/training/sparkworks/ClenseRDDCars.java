package com.training.sparkworks;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

/*
 * 
 * 	toyota,gas,std,two,hatchback,fwd,four,62,4800,35,39,5348
	toyota,gas,std,two,hatchback,fwd,four,62,4800,31,38,6338
 */
public class ClenseRDDCars  implements Function<String, String>{

	@Override
	public String call(String v1) throws Exception {
		String[] attributeList = v1.split(","); 
		
		// change characters to number 
		attributeList[3] = (attributeList[3].equals("two"))?"2":"4"; 
		// to change car type to upper case 
		attributeList[4] = attributeList[4].toUpperCase(); 
		return Arrays.toString(attributeList); 
	} 

	
}
