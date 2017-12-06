package com.exilant.day2;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import kafka.utils.ShutdownableThread;

public class Consumer extends ShutdownableThread {

	private KafkaConsumer<Integer, String> consumer;
	private String topic;

	public Consumer(String name, boolean isInterruptible) {
		super(name, isInterruptible);

		Properties properties = new Properties();

		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
				KafkaProperties.KAFKA_SERVER_URL + ":" + KafkaProperties.KAFKA_SERVER_PORT);

		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "DemoConsumer1");
		properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
		properties.setProperty(ConsumerConfig.REQUEST_TIMEOUT_MS_CONFIG, "30000");

		// deserialize information

		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class.getName());

		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		this.topic = name;
		consumer = new KafkaConsumer<>(properties);
	}

	@Override
	public void doWork() {
		// will subscribe

		consumer.subscribe(Collections.singletonList(this.topic));
		ConsumerRecords<Integer, String> consumerRecords = consumer.poll(1000);

		for (ConsumerRecord<Integer, String> record : consumerRecords) {
			System.out.println("Key : " + record.key() + ", Value : " + record.value() + ", Offset : " + record.offset()
					+ ", Partition " + record.partition());
		}
	}
}
