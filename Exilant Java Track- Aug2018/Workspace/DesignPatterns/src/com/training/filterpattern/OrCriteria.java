package com.training.filterpattern;

import java.util.List;

public class OrCriteria  implements ICriteria{
	private ICriteria first; 
	private ICriteria second; 

	public OrCriteria(ICriteria first, ICriteria second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> firstList = first.meetCriteria(persons); 
		List<Person> secondList = second.meetCriteria(persons); 
		
		// if used addAll typecast to set and override hashCode and equals 
		// in person class 
		//firstList.addAll(secondList);
		
		// or 
		for(Person temp : secondList) {
			if(!firstList.contains(temp)) {
				firstList.add(temp); 
			}
		}
		return firstList; 
	}


}
