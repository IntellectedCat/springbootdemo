package top.study.springbootdemo.mybatisplus.mapper;

import top.study.springbootdemo.mybatisplus.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jjhe
 * @since 2020-08-11
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    public List<Teacher> findTeacherStudent();

}
