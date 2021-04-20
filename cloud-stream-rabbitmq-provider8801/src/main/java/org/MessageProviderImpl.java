package org;

import org.example.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    @Qualifier("output")
    private MessageChannel messageChannel;

    @Override
    public String send() {
        String s = UUID.randomUUID().toString();
        messageChannel.send(MessageBuilder.withPayload(s).build());
        System.out.println("serial = " + s);
        return s;
    }
}
