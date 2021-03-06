package dangwei.servlet;

import dangwei.exception.BusinessException;
import dangwei.model.Article;
import dangwei.uti.JSONUtil;
import dao.ArticleDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * ClassName:ArticleUpdateServlet
 * Package:dangwei.servlet
 * Description:
 *
 * @Date:2020/5/13 19:48
 * @Author:DangWei
 */
@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // 文章修改：包含id,title,content
        InputStream is = req.getInputStream();
        Article article = JSONUtil.deserialize(is, Article.class);
        System.out.println("===================================\n"+article);
        int num = ArticleDAO.update(article);
        if(num != 1)
            throw new BusinessException("004", "文章修改出错");
        //模拟数据库修改数据操作
        return null;
    }
}

