package top.study.springbootdemo.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import top.study.springbootdemo.entity.Teacher;
import lombok.Data;

@Data
public class StudentTeacher {

    private static final long serialVersionUID=1L;

    private Integer stuId;

    private String stuName;

    @JsonIgnore
    private String password;

    private Teacher teacher;
}
