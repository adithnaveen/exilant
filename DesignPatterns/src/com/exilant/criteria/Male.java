package com.exilant.criteria;

import java.util.ArrayList;
import java.util.List;

public class Male implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> maleList = new ArrayList<Person>();
		
		for(Person temp : persons){
			if(temp.getSex().equalsIgnoreCase
					("male")){
				maleList.add(temp);
			}
		}
		return maleList;
	}
}

