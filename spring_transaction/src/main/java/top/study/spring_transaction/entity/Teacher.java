package top.study.spring_transaction.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2020-08-11
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName("t_teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "teac_id", type = IdType.AUTO)
      private Integer teacId;

    private String teacName;

}
