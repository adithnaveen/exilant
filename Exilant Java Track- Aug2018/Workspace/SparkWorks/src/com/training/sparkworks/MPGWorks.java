package com.training.sparkworks;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class MPGWorks implements Function2<String, String, String> {

	@Override
	public String call(String arg0, String arg1) throws Exception {

		int firstVal = 0;
		int secondVal = 0;

		// First parameter - might be a numeric or string. handle appropriately
		firstVal = (isNumeric(arg0) ? 
            Integer.valueOf(arg0) : getMPGValue(arg0));
		// Second parameter.
		secondVal = (isNumeric(arg1) ? 
            Integer.valueOf(arg1) : getMPGValue(arg1));

		return Integer.valueOf(firstVal + secondVal).toString();
	}

	// Internal function to extract MPG
	private int getMPGValue(String str) {
		// System.out.println(str);
		String[] attList = str.split(",");
		if (isNumeric(attList[9])) {
			return Integer.valueOf(attList[9]);
		} else {
			return 0;
		}
	}

	// Internal function to check if value is numeric
	private boolean isNumeric(String s) {
		return s.matches("\\d+");
	}

}