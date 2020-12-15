package top.study.spring_transaction.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import top.study.spring_transaction.entity.Teacher;

@Data
public class StudentTeacher {

    private static final long serialVersionUID=1L;

    private Integer stuId;

    private String stuName;

    @JsonIgnore
    private String password;

    private Teacher teacher;
}
