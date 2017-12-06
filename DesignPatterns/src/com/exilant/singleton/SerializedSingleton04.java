package com.exilant.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingleton04 {
	public static void main(String[] args) throws 
	FileNotFoundException, IOException, 
	ClassNotFoundException {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sample.ser"));
		out.writeObject(instanceOne);
		// to save 
		out.close();
		System.out.println("InstanceOne - hashCode " + instanceOne.hashCode());
		System.out.println("Data Saved... ");
		//////////////////////////////////////////////////////////////////
		// deserialize from the file 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.ser"));
		
		EagerSingleton instanceTwo = (EagerSingleton) ois.readObject();
		ois.close();
		
		System.out.println("instanceTwo - hashCode " + instanceTwo.hashCode());
		
	}
}
