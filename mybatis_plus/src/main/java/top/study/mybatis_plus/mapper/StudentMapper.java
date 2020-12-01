package top.study.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.study.mybatis_plus.entity.Student;
import top.study.mybatis_plus.entity.vo.StudentTeacher;

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
