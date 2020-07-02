package dangwei.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * ClassName:Article
 * Package:dangwei.model
 * Description:
 *
 * @Date:2020/5/10 21:45
 * @Author:DangWei
 */

@Getter
@Setter
@ToString
public class Article {

    private Integer id;

    private String title;

    private String content;

    private Integer userId;

    private Date createTime;

    //新增文章时，传入的字段
    private String userAccout;
}