package com.exilant.lambda;


@FunctionalInterface
interface MathOperation{
	int operation(int num1, int num2);
}

public class LambdaEx03 {
	
	static int operate(int num1, int num2, MathOperation mo){
		return mo.operation(num1, num2);
	}
	
	public static void main(String[] args) {
		MathOperation add = (int num1, int num2 ) ->  num1 +num2;
		MathOperation sub = (num1, num2) -> num1 - num2;
		MathOperation mul = (num1, num2 ) -> num1 * num2;
		MathOperation div = (num1, num2) -> num1 / num2;
		
		System.out.println(operate(100, 200, add));
		System.out.println(operate(200, 22, sub));
		
		MathOperation m1 = (num1, num2) -> num1 + num2; 
		
		System.out.println("without operate call " +m1.operation(100, 222));
	}
}
