package top.study.spring_transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.study.spring_transaction.entity.Teacher;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jjhe
 * @since 2020-08-11
 */
public interface TeacherService extends IService<Teacher> {

    public List<Teacher> findTeacherStudentVO(Integer teacId);

    Integer insertOne(Teacher teacher);
}
