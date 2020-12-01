package top.study.mybatis_plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.study.mybatis_plus.entity.Student;
import top.study.mybatis_plus.entity.vo.StudentTeacher;

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
