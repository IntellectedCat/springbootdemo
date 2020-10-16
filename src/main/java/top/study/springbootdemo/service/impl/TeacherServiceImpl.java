package top.study.springbootdemo.service.impl;

import top.study.springbootdemo.entity.Teacher;
import top.study.springbootdemo.mapper.TeacherMapper;
import top.study.springbootdemo.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Teacher> findTeacherStudent(){
        return teacherMapper.findTeacherStudent();
    }
}
