package top.study.springbootdemo.service.impl;

import top.study.springbootdemo.entity.Student;
import top.study.springbootdemo.entity.vo.StudentTeacher;
import top.study.springbootdemo.mapper.StudentMapper;
import top.study.springbootdemo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
