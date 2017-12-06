package com.exilant.lambda;


@FunctionalInterface
public interface WorkerInterface {
	public void doSomeWork();
}


@FunctionalInterface
interface Executable{
	int execute(int a, int b);
}

@FunctionalInterface
interface Executable1{
	Object execute(int a, int b);
}

@FunctionalInterface
interface StringExecutable{
	void execute(String str);
}