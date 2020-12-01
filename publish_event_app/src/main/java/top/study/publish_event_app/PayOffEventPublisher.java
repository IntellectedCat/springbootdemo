package top.study.publish_event_app;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * 事件发布者
 * */
@Service
public class PayOffEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void payOffEventPublish(PayOffEvent payOffEvent) {
        applicationEventPublisher.publishEvent(payOffEvent);
    }
}
