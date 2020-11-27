package top.study.springbootdemo.mybatisplus.mapper;

import top.study.springbootdemo.mybatisplus.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.study.springbootdemo.mybatisplus.entity.vo.StudentTeacher;
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
