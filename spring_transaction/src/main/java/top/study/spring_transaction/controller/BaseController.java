package top.study.spring_transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.entity.vo.StudentTeacher;
import top.study.spring_transaction.service.StudentService;

import java.util.List;

@RestController
public class BaseController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/findStudentTeacherVO")
    public List<StudentTeacher> findStudentTeacherVO(Integer stuId) {
        return studentService.findStudentTeacherVO(stuId);
    }

    @RequestMapping("/findAllStudent")
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }
}
