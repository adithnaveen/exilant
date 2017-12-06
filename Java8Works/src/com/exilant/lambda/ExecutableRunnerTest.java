package com.exilant.lambda;

public class ExecutableRunnerTest {
	public static void main(String[] args) {
		Runner runner = new Runner(); 
		
		
		runner.execute(new Executable() {
			
			@Override
			public int execute(int a, int b) {
				return a + b;
			}
		});
		
		
		runner.execute1((a, b) -> a > b);
		
		runner.execute((a, b) -> {
			return a +b	;
		});
		
		Executable e =  (a, b ) -> {
			return a + b; 
		};
		
		System.out.println(e.execute(140, 20));
		
		
		Object codeBlock = (Executable) (a, b) -> {
			return a + b; 
		};
		
		
		System.out.println(
		((Executable)codeBlock).execute(22, 33)
				);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
