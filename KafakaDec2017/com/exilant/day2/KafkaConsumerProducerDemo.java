package com.exilant.day2;

public class KafkaConsumerProducerDemo {
	public static void main(String[] args) {
		boolean isAsync = false; 
		
		Producer producer = new Producer(KafkaProperties.TOPIC, isAsync); 
		producer.start();
		
		Consumer consumer = new Consumer(KafkaProperties.TOPIC, 
					true);
		consumer.start();
	}
}
