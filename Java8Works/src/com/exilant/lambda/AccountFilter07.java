package com.exilant.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class AccountPredicates{
	public static Predicate<Account> onlyMale(){
		return p -> p.getSex().equalsIgnoreCase("male");
	}
	
	public static Predicate<Account> onlyPriorityCust(){
		return p -> p.getBalance()>5000;
	}
	
	public static List<Account> filterAccount(List<Account> accounts,
			Predicate<Account> predicate ){
		
		return accounts.stream().filter(predicate).collect(Collectors.toList());
	}
	
}

public class AccountFilter07 {
	public static void main(String[] args) {
		
		List<Account> accountList = Arrays.asList(
				
				new Account(222, 3343, "Harry", "Male"), 
				new Account(233, 4444, "Jitin", "Male"), 
				new Account(444, 3000, "Smita", "Female"), 
				new Account(111, 7000, "Abhi", "Male"), 
				new Account(212, 5000, "Kanchan", "Female")
				);
		
		
		System.out.println("----------Getting only males-----------");
		
		List<Account> onlyMaleList = 
				AccountPredicates.filterAccount(accountList, 
						AccountPredicates.onlyMale());
		
		onlyMaleList.forEach(System.out :: println);
		
		System.out.println("----------- sort on name------------");
		onlyMaleList.sort(Comparator.comparing(Account :: getCustName));
		onlyMaleList.forEach(System.out :: println);
		
		System.out.println("------ ascending based on balance------------");
		// onlyMaleList.sort(Comparator.comparing(Account :: getBalance));
		onlyMaleList.sort(Comparator.comparing( acc -> acc.getBalance() ));
		onlyMaleList.forEach(System.out :: println);

		
		Comparator<Account> groupedComparator = Comparator.comparing(Account :: getSex)
					.thenComparing(Comparator.comparing(Account::getBalance));
		
		accountList.sort(groupedComparator);
		System.out.println("--------- (Grouped Comparator)based on sex then with balance-----  ");
		accountList.forEach(System.out :: println);
		
		

	}
	
	
	
	
}



















