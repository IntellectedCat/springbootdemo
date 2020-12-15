package top.study.spring_transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.entity.Teacher;
import top.study.spring_transaction.entity.vo.StudentTeacher;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jjhe
 * @since 2020-08-10
 */
public interface StudentService extends IService<Student> {

    List<Student> findAllStudent();

    List<StudentTeacher> findStudentTeacherVO(Integer stuId);

    Integer insertOne(Student student);
}
