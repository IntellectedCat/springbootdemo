package top.study.spring_transaction.transaction_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.mapper.StudentMapper;

@Component
public class TransactionSub {


    @Autowired
    StudentMapper studentMapper;

    public void subNoError() {
        System.out.println("subNoError");
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        System.out.println("subNoError!");
    }

//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sub() {
        System.out.println("sub");
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        try {
            System.out.println(10/0);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        System.out.println("sub!");
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sub2() {
        System.out.println("sub2");
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        try {
            System.out.println(10/0);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        System.out.println("sub!");
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void sub3() {
        System.out.println("sub3");
//        Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        try {
            System.out.println(10/0);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        System.out.println("sub3!");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void sub5() {
        System.out.println("sub5");
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        System.out.println("sub5!");
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void sub6() {
        System.out.println("sub6");
        Student student = new Student();
        student.setStuName("小舞");
        studentMapper.insert(student);
        System.out.println("sub6!");
    }
}
