package top.study.springbootdemo.applicationPublishEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 事件监听者
 * 可通过添加监听者（例如员工）来扩展业务
 * */
@Service
public class PayOffListener implements ApplicationListener<PayOffEvent> {
    @Override
    public void onApplicationEvent(PayOffEvent payOffEvent) {
        System.out.println(((Company)payOffEvent.getSource()).getName() + "终于发工资了");
    }
}
