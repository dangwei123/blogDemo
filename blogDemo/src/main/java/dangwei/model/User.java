package dangwei.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * ClassName:User
 * Package:dangwei.model
 * Description:
 *
 * @Date:2020/5/10 21:45
 * @Author:DangWei
 */
@Getter
@Setter
@ToString
public class User {

    private Integer id;

    private String name;

    //使用的是java.util.Date
    private Date createTime;
}

