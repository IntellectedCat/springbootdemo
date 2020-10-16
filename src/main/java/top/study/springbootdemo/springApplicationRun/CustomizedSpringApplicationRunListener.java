package top.study.springbootdemo.springApplicationRun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class CustomizedSpringApplicationRunListener implements SpringApplicationRunListener {

    Logger logger = LoggerFactory.getLogger(CustomizedSpringApplicationRunListener.class);

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        logger.info("environmentPrepared执行完毕");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        logger.info("contextPrepared执行完毕");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        logger.info("contextLoaded执行完毕");
    }
}
