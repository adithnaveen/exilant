package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria {


	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> singleList = new ArrayList<>(); 
		
		for(Person temp : persons) {
			if(temp.getMartialStatus().equals("single")) {
				singleList.add(temp);
			}
			
		}
		
		return singleList; 

	}
}
