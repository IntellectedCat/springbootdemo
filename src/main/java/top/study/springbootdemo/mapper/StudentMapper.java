package top.study.springbootdemo.mapper;

import top.study.springbootdemo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.study.springbootdemo.entity.vo.StudentTeacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jjhe
 * @since 2020-08-10
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    public List<Student> findAllStudent();

    public List<Student> findStudentTeacher(Integer teacId);

    public List<StudentTeacher> findStudentTeacherByVO(Integer teacId);
}
