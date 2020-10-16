package top.study.springbootdemo.service;

import top.study.springbootdemo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import top.study.springbootdemo.entity.vo.StudentTeacher;

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

    public List<Student> findAllStudent();

    public List<Student> findStudentTeacher(Integer teacId);

    public List<StudentTeacher> findStudentTeacherByVO(Integer teacId);
}
