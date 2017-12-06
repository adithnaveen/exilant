package com.exilant.day2;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer extends Thread{
	
	private KafkaProducer<Integer, String> producer; 
	private String topic ; 
	private Boolean isAsync;
	
	public Producer(String topic, Boolean isAsync){
		Properties properties = new Properties();
		
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
					KafkaProperties.KAFKA_SERVER_URL +":" + 
					KafkaProperties.KAFKA_SERVER_PORT );

		properties.setProperty(ProducerConfig.CLIENT_ID_CONFIG, "DemoProducer");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
				IntegerSerializer.class.getName());
		
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
				StringSerializer.class.getName());
		
		this.topic = topic;
		this.isAsync = isAsync;
		producer = new KafkaProducer<Integer, String>(properties);
	}
	
	@Override
	public void run(){
		// push some message with key -> integer 
		int messageId = 1;
		while(true){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String message = "Message : " + messageId;
			long startTime = System.currentTimeMillis(); 
			if(this.isAsync){
				// send message Asynchronously 
				ProducerRecord<Integer, String> producerRecord = 
						new ProducerRecord<Integer, String>
						(this.topic, messageId, message);
				
				
				producer.send(producerRecord, 
						new DemoCallBack(startTime, messageId, message));
			}else{
				try {
					ProducerRecord<Integer, String> producerRecord = 
							new ProducerRecord<Integer, String>
							(this.topic, messageId, message);
					
					producer.send(producerRecord).get();
					System.out.println("Synchronous -> Message id " +
							messageId +", " + message);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
			
			messageId ++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
