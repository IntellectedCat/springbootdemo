package top.study.mybatis_plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.study.mybatis_plus.entity.Teacher;

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

    public List<Teacher> findTeacherStudent();
}
