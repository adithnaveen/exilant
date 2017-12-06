package com.exilant.day2;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class DemoCallBack implements Callback{
	private long startTime; 
	private int key; 
	private String message;
	
	public DemoCallBack(long startTime, int key, String message){
		this.startTime = startTime;
		this.key = key;
		this.message = message;
	}
	
	@Override
	public void onCompletion(RecordMetadata metaData, Exception arg1) {
		// will give time difference in ms
		long timeElapsed = System.currentTimeMillis() - this.startTime;
		if(metaData != null){
			System.out.println("Message got ->  " + 
						this.key +", " + 
						this.message +", Time Taken" + 
						timeElapsed +", offset " + 
						metaData.offset());
			
		}else{
			// either get the printstack trace or print as is
			System.err.println(arg1);
		}
	}

}






