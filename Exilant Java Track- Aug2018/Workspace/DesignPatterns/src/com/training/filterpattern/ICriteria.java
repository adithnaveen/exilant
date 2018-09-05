package com.training.filterpattern;

import java.util.List;

public interface ICriteria {
	public List<Person> meetCriteria(List<Person> persons); 
}
