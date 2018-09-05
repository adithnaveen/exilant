package com.kafka.day2;

public class ClientConsumer {
	public static void main(String[] args) {
		Consumer1 consumer1 = new 
				Consumer1(KafkaProperties.TOPIC1);  
		
		consumer1.start(); 
	}
}
