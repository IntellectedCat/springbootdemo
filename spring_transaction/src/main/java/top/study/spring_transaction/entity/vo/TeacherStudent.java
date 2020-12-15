package top.study.spring_transaction.entity.vo;

import lombok.Data;
import top.study.spring_transaction.entity.Student;

import java.util.List;

@Data
public class TeacherStudent {

    private static final long serialVersionUID=1L;

    private Integer teacId;

    private String teacName;

    private List<Student> studentList;
}
