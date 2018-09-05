package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> maleList = new ArrayList<Person>(); 
		
		for(Person temp : persons) {
			if(temp.getSex().equals("male")) {
				maleList.add(temp);
			}
		}
		
		return maleList; 
		
	}

}
