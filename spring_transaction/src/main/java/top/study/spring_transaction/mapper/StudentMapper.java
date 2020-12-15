package top.study.spring_transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.entity.vo.StudentTeacher;

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

    List<Student> findAllStudent();

    List<StudentTeacher> findStudentTeacherVO(Integer stuId);
}
