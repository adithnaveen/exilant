package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Married  implements ICriteria{


	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> marriedList = new ArrayList<>(); 
		
		for(Person temp : persons) {
			if(temp.getMartialStatus().equals("married")) {
				marriedList.add(temp);
			}
			
		}
		
		return marriedList; 

	}
}
