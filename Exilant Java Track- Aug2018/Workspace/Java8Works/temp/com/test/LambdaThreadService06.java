package com.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {
	public static void main(String[] args) throws InterruptedException,  Exception {
		// before java 8 
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new  Runnable() {
			public void run() {
				System.out.println("in Anonymous Block...");
			}
		});
		executorService.shutdown();
		
		// from java 8 
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(() -> {
			System.out.println("in Lambda anonymous block");
		});
		executorService1.shutdown();
		
		
		
		System.out.println("********** Callables example ************* ");
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables = initCallable();
		// String result = executorService2.invokeAny(callables);
		
		
		List<Future<String>> result = executorService2.invokeAll(callables);
		System.out.println("Result is " + result);
		
//		result.forEach(temp -> System.out.println(temp.get()));
		
		for(Future temp : result){
			System.out.println(temp.get());
		}

		executorService2.shutdown();
		
	}
	
	public static Set<Callable<String>> initCallable(){
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		callables.add(() -> "Task 21 Called");
		callables.add(() -> "Task 22 Called");
		
		callables.add(() -> "Task 23 Called");
		callables.add(() -> "Task 24 Called");
		callables.add(() -> "Task 25 Called");
		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Task 1 Called";
			}
			
		});
		
		callables.add(() -> "Task 2 Called");
		
		
		callables.add(() -> {
			return "Task 2 Called";
		});
		
		return callables;
	}
}



