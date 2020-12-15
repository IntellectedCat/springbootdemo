package top.study.spring_transaction.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.study.spring_transaction.entity.Teacher;
import top.study.spring_transaction.mapper.TeacherMapper;
import top.study.spring_transaction.service.TeacherService;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jjhe
 * @since 2020-08-11
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findTeacherStudentVO(Integer teacId){
        return teacherMapper.findTeacherStudent();
    }

    @Override
    public Integer insertOne(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }
}
