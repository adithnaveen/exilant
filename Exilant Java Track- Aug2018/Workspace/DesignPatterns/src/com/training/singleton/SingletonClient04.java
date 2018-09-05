package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// to persist the data to file with OOS/OIS 
public class SingletonClient04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Singleton singleton = Singleton.getInstance(); 
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Sample.ser")); 
		
		out.writeObject(singleton);
		
		System.out.println("Object Saved with hashCode " + singleton);
		out.close(); 
		////////////////////deserialize/////////////////////////////////////////////
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Sample.ser")); 
		
		Singleton singletonI2 = (Singleton) ois.readObject(); 
		ois.close(); 
		
		System.out.println("Object received with hashCode " + singletonI2);
	}
}
