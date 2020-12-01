package top.study.mybatis_plus.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import top.study.mybatis_plus.entity.Student;
import top.study.mybatis_plus.entity.Teacher;

import java.util.List;

@Data
public class TeacherStudent {

    private static final long serialVersionUID=1L;

    private Integer teacId;

    private String teacName;

    private List<Student> studentList;
}
