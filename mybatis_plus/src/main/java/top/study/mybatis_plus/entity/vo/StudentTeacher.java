package top.study.mybatis_plus.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import top.study.mybatis_plus.entity.Teacher;

@Data
public class StudentTeacher {

    private static final long serialVersionUID=1L;

    private Integer stuId;

    private String stuName;

    @JsonIgnore
    private String password;

    private Teacher teacher;
}
