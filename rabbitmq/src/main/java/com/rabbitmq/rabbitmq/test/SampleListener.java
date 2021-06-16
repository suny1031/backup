package com.rabbitmq.rabbitmq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {
    private static final Logger log = LoggerFactory.getLogger(SampleListener.class);

//    @RabbitListener(queues = "sample.queues")
//    public void receiveMessage(final Message message) {
//        log.info(message.toString());
//    }

    @RabbitListener(bindings = @QueueBinding(
            value = @org.springframework.amqp.rabbit.annotation.Queue (value = "sample.queues", durable = "false", exclusive = "false", autoDelete = "true"),
            exchange = @Exchange(value = "sample.exchange", ignoreDeclarationExceptions = "true", durable = "false", type = ExchangeTypes.FANOUT)
    )
    )
    public void receiveMessage(final Message message) {
        log.info(message.toString());





    }


}