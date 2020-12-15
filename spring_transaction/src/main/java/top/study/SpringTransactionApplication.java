package top.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.study.spring_transaction.mapper")
public class SpringTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionApplication.class, args);
    }
}
