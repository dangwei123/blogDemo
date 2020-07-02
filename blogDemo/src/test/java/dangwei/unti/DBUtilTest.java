package dangwei.unti;

import dangwei.uti.DBUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * ClassName:DBUtilTest
 * Package:dangwei.unti
 * Description:
 *
 * @Date:2020/5/16 19:37
 * @Author:DangWei
 */
public class DBUtilTest {
    @Test
    public void testConnection(){
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
