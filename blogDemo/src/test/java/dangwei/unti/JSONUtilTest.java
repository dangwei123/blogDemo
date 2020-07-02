package dangwei.unti;

import com.fasterxml.jackson.databind.ObjectMapper;
import dangwei.model.Article;
import org.junit.Test;

import java.util.Date;

/**
 * ClassName:JSONUtilTest
 * Package:dangwei.unti
 * Description:
 *
 * @Date:2020/5/11 8:09
 * @Author:DangWei
 */
public class JSONUtilTest {
    @Test
    public void t1(){
        try {
            ObjectMapper mapper=new ObjectMapper();
            Article article=new Article();
            article.setId(1);
            article.setTitle("作诗");
            article.setContent("孤舟蓑笠翁");
            article.setUserId(1);
            article.setCreateTime(new Date());
            //序列化
            String s=mapper.writeValueAsString(article);
            System.out.println(s);
            //反序列化
            Article o=mapper.readValue(s,Article.class);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
