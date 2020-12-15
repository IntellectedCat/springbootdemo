package top.study.spring_transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.study.spring_transaction.transaction_service.TransactionSub;
import top.study.spring_transaction.transaction_service.TransactionSuper;

@RestController
public class TransactionController {

    @Autowired
    TransactionSuper transactionSuper;
    @Autowired
    TransactionSub transactionSub;

    @RequestMapping("/test")
    public void test(Integer index) throws Exception {
        switch (index){
            case 1:
                // 没有事务，不支持回滚
                transactionSub.sub();
                break;
            case 2:
                // 有事务，为require，支持回滚
                // id依旧会自增长，也即原来是10，调用完一次后，11就被废弃掉了，下一次正常插入数据时，id为12
                transactionSub.sub2();
                break;
            case 3:
                // 上级有事务，为require，下级没有事务
                // 因此，由于事务传播机制，下级事务回滚
                transactionSuper.sup();
                break;
            case 4:
                // 上级没有事务，下级有事务，为require
                // 因此，下级事务被回滚
                transactionSuper.sup2();
                break;
            case 5:
                // 上下级均有事务，均为require
                // 因此，下级事务被回滚
                transactionSuper.sup3();
                break;
            case 6:
                // 上级有事务，为require，且在下级执行完毕后，有runtimeException，下级没有事务
                // 因此，由于事务传播机制，下级事务被回滚
                transactionSuper.sup4();
                break;
            case 7:
                // 上级有事务，为require，且在下级执行完毕后，有runtimeException，下级有事务，为require_new
                // 因此，下级的事务不会回滚，因为不是同一个事务
                transactionSuper.sup5();
                break;
            case 8:
                // 上级有事务，为require，且在下级执行完毕后，有runtimeException，下级有事务，为not_support
                transactionSuper.sup6();
                break;
        }
    }

}
