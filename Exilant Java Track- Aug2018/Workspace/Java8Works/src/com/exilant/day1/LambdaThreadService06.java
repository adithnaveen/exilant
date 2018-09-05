package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {
	public static void main(String[] args)
				throws InterruptedException, ExecutionException {
		// java 7 and older way 
		ExecutorService executorService = Executors.newSingleThreadExecutor(); 
		
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi i'm in Anonymous Block");
			}
		});
		
		executorService.shutdown();
		
		// java 8 way 
		ExecutorService executorService1 = Executors.newSingleThreadExecutor(); 
		
		executorService1.execute(() -> {
			System.out.println("Hi i'm in lambda block");
		}); 
		executorService1.shutdown(); 
		
		
		System.out.println("----------- callables work -----------------");
		
		ExecutorService executorSerivce2 = Executors.newSingleThreadExecutor(); 
		
		Set<Callable<String>> callables = initializeCallables(); 
		
//		String result = executorSerivce2.invokeAny(callables); 
//		System.out.println("Result : " + result);
		List<Future<String>> results =  executorSerivce2.invokeAll(callables); 
		
		for(Future temp : results) { 
			System.out.println(temp.get());
		}
		executorSerivce2.shutdown(); 
		
	}
	
	
	// this methods will create set of callables (each callable is 1 thread) 
	// this method will scafold the threads in real world 
	public static Set<Callable<String>>  initializeCallables(){
		Set<Callable<String>> callables = new HashSet<Callable<String>>(); 
		
		callables.add(() -> "1st Callable"); 
		callables.add(() -> "2nd Callable"); 
		callables.add(() -> "3rd Callable"); 
		callables.add(() -> "4th Callable"); 
		callables.add(() -> "5th Callable"); 
		callables.add(() -> "6th Callable"); 
		
		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Callable thread in anonymous class"; 
			}
			
		});
		
		callables.add(() -> {return "complex called business logic "; }); 
		
		return callables; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
