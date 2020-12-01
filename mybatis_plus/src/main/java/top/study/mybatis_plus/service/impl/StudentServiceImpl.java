package top.study.mybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.study.mybatis_plus.entity.Student;
import top.study.mybatis_plus.entity.vo.StudentTeacher;
import top.study.mybatis_plus.mapper.StudentMapper;
import top.study.mybatis_plus.service.StudentService;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jjhe
 * @since 2020-08-10
 */
@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    public List<Student> findStudentTeacher(Integer teacId){
        return studentMapper.findStudentTeacher(teacId);
    }

    public List<StudentTeacher> findStudentTeacherByVO(Integer teacId){
        return studentMapper.findStudentTeacherByVO(teacId);
    }
}
