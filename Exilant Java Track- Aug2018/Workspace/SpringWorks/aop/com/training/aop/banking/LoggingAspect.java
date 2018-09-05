package com.training.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	// this will scan for any package(configured) 
	// this will scan for any class 
	
	// to specify the method exactly but this will find in any package
	//  @Before("execution(public double getBalance())")
	
	
	// we can also have fully qualified named 
//	@Before("execution(public double com.training.aop.model.CAAccount.showBalance())")
	
	// regular expression to log all getters 
	// public getters shall be logged 
	// @Before("execution(public * get*())")
	
	
	// log all getters 
	// @Before("execution( * get*())")
	
	
	// regex for taking 1 param 
//	@Before("execution( * get*(*))")
	
	// log all the getters who either take the param or not 
//	@Before("execution( * get*(..))")
	
	
	// any return type in any class of package com.training.aop.model 
	@Before("execution(* com.training.aop.model.*.getBalance())")
	public void loggingAdviceBefore() {
		System.out.println("**** Logging Before Called ****");
	}
	
	@Before("allGetters()")
	public void secondAdvise() {
		System.out.println("Second Aspect Invoked for all getters... ");
	}
	
	@Before("allGettersSBAccount()")
	public void secondAdviceForSBAccount() {
		System.out.println("Only for SB Account... ");
	}
	
	@Before("allGetters() || allGettersSBAccount()")
	public void compountAdvice() {
		System.out.println("This is compound advice for or "
				+ "clause of getters and sb acount ");
	}
	
	
	// if you have too many advises then its difficult 
	// to maintain so we can have a dummy method 
	// annotated with the regex and we can use the method 
	// instead of annotation 
	
	@Pointcut("execution( * get*(..))")
	public void allGetters() {
	}
	
	@Pointcut("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void allGettersSBAccount() {
	}
}













