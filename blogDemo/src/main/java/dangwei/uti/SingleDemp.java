package dangwei.uti;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

/**
 * ClassName:SingleDemp
 * Package:dangwei.uti
 * Description:
 *
 * @Date:2020/5/17 19:58
 * @Author:DangWei
 */
public class SingleDemp {
    //多线程环境下，调用DemoSingleton.getDataSource()也是线程安全的，
    //JVM在类加载的时候，类只加载一次，并且是线程安全的
    public static DataSource getDataSource(){
        return Holder.getDataSource();
    }

    private static class Holder{
        private static final DataSource DATA_SOURCE=new MysqlDataSource();
        static{
            ((MysqlDataSource)DATA_SOURCE).setURL("");
            ((MysqlDataSource)DATA_SOURCE).setPassword("");
            ((MysqlDataSource)DATA_SOURCE).setUser("");
        }
        public static DataSource getDataSource(){
            return DATA_SOURCE;
        }
    }
}
