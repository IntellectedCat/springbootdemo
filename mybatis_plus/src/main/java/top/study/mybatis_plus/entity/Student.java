package top.study.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jjhe
 * @since 2020-08-10
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName("t_student")
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "stu_id", type = IdType.AUTO)
    private Integer stuId;

    private String stuName;

    @JsonIgnore
    private String password;

    private Integer teacId;
}
