package com.exilant.criteria;

import java.util.List;
import java.util.stream.Collectors;

public class Female  implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		return 
				persons.stream().filter
				(temp -> temp.getSex().equalsIgnoreCase("female"))
				.collect(Collectors.toList());

	}
}
