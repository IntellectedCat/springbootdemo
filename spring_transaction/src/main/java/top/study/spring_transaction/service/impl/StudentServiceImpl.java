package top.study.spring_transaction.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.study.spring_transaction.entity.Student;
import top.study.spring_transaction.entity.vo.StudentTeacher;
import top.study.spring_transaction.mapper.StudentMapper;
import top.study.spring_transaction.service.StudentService;

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

    @Override
    public List<StudentTeacher> findStudentTeacherVO(Integer stuId){
        return studentMapper.findStudentTeacherVO(stuId);
    }

    @Override
    public Integer insertOne(Student student) {
        return studentMapper.insert(student);
    }
}
