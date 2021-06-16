package com.rabbitmq.publisher;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class PublisherApplication {

    private static final String QUEUE_NAME = "sample.queue";

    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            for (int i = 0; i <= 100000; i++) {
                channel.queueDeclare(QUEUE_NAME, false, false, false, null);
                String message = "Hello World!" + (int) (Math.random() * 100);
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println(" [x] Set '" + message + "'");
                Thread.sleep(10);
            }
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
