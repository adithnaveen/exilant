package com.exilant.day2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kafka.api.FetchRequest;
import kafka.api.FetchRequestBuilder;
import kafka.api.FetchResponse;


import kafka.javaapi.consumer.SimpleConsumer;
import kafka.javaapi.message.ByteBufferMessageSet;
import kafka.message.MessageAndOffset;

public class MultiProducerConsumerDemo {
	
	
	public static void generateDatea(){
		Producer producer1 = new Producer(KafkaProperties.TOPIC2, false);
		producer1.start();
		
		Producer producer2 = new Producer(KafkaProperties.TOPIC3, false);
		producer2.start();		
	}
	
	
	// import kafka.javaapi.message.ByteBufferMessageSet;

	public static void printMessage(ByteBufferMessageSet messageSet) 
				throws UnsupportedEncodingException{
		
		for(MessageAndOffset messageAndOffset : messageSet){
			// get each message in the set 
			System.out.println("Payload Size: " +
					messageAndOffset.message().payloadSize());

			ByteBuffer payload = messageAndOffset.message().payload();
			
			byte [] bytes = new byte[payload.limit()];
			payload.get(bytes);
			System.out.println(new String(bytes, "UTF-8"));
			
		}
	}
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws UnsupportedEncodingException {
		generateDatea();
		
		@SuppressWarnings("deprecation")
		SimpleConsumer simpleConsumer = 
				new SimpleConsumer(
						KafkaProperties.KAFKA_SERVER_URL, 
						KafkaProperties.KAFKA_SERVER_PORT, 
						KafkaProperties.CONNECTION_TIMEOUT, 
						KafkaProperties.KAFKA_PRODUCER_BUFFER_SIZE, 
						KafkaProperties.CLIENT_ID);
		/////////////////////////////////////////////////////////
		System.out.println("Single Fetch... ");
		
		FetchRequest request = new FetchRequestBuilder()
				.clientId(KafkaProperties.CLIENT_ID)
				.addFetch(KafkaProperties.TOPIC2, 0, 0L, 200)
				.build();
		
		
		kafka.javaapi.FetchResponse response = 
					simpleConsumer.fetch(request);
		
		printMessage(response.messageSet(KafkaProperties.TOPIC2, 0));
/////////////////////////////////////////////////////////
		
		
		
		// Fetch Multiple messages 
		
		Map<String, List<Integer>> topicsMap = 
					new HashMap<String, List<Integer>>();
		// singletonList(0) -> is taking from offset value 0 
		topicsMap.put(KafkaProperties.TOPIC2, Collections.singletonList(0));
		topicsMap.put(KafkaProperties.TOPIC3, Collections.singletonList(0));
		
		request = new FetchRequestBuilder()
				.clientId(KafkaProperties.CLIENT_ID)
				.addFetch(KafkaProperties.TOPIC2, 0, 0L, 10*1024)
				.addFetch(KafkaProperties.TOPIC3, 0, 0L, 10*1024)
				.build();
		
		response = simpleConsumer.fetch(request);
		
		for(Map.Entry<String, List<Integer>> entry : topicsMap.entrySet()){
			String topic = entry.getKey(); 
			
			for(Integer partition : entry.getValue()){
				printMessage(response.messageSet(topic, partition));
			}
		}
		
				
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
