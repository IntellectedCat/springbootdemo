package top.study.spring_transaction.transaction_service;

import org.omg.CORBA.TRANSACTION_REQUIRED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.error.CustomizedError;
import top.study.spring_transaction.mapper.StudentMapper;

@Component
public class TransactionSuper {

    @Autowired
    TransactionSub transactionSub;
    @Autowired
    StudentMapper studentMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sup() throws Exception {
        System.out.println("sup");
        transactionSub.sub2();
        System.out.println("sup!");
    }

    public void sup2() throws Exception {
        System.out.println("sup2");
        transactionSub.sub2();
        System.out.println("sup2!");
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sup3() throws Exception {
        System.out.println("sup3");
        transactionSub.sub3();
        System.out.println("sup3!");
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sup4() throws Exception {
        System.out.println("sup4");
        transactionSub.subNoError();
        try {
            System.out.println(10/0);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        System.out.println("sup4!");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void sup5() {
        System.out.println("sup5");
        transactionSub.sub5();
        try {
            System.out.println(10/0);
        } catch (CustomizedError e) {
//            throw new Exception();
        }
        System.out.println("sup5!");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void sup6() {
        System.out.println("sup6");
        transactionSub.sub6();
        try {
            System.out.println(10/0);
        } catch (CustomizedError e) {
//            throw new Exception();
        }
        System.out.println("sup6!");
    }
}
