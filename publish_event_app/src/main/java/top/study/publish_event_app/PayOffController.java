package top.study.publish_event_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PayOffController {

    @Autowired
    private PayOffEventPublisher payOffEventPublisher;

    @RequestMapping("/pay")
    @ResponseBody
    public String pay(){
        Company company = new Company("腾讯");
        PayOffEvent payOffEvent = new PayOffEvent(company);
        payOffEvent.pay(company);
        payOffEventPublisher.payOffEventPublish(payOffEvent);
        return "";
    }
}
