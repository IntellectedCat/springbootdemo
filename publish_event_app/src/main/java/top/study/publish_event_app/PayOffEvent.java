package top.study.publish_event_app;

import org.springframework.context.ApplicationEvent;

/**
 * 事件
 * */
public class PayOffEvent extends ApplicationEvent {

    public PayOffEvent(Object source) {
        super(source);

    }

    public void pay(Company company){
        System.out.println(company.getName() + "发工资啦");
    }
}
