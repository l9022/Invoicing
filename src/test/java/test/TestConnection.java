package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestConnection {

	@Test
	public void testConn() {  
        //读取hibernate.cfg.xml中的配置信息  
        Configuration config = new Configuration();  
        config.configure();  
        //获取数据库的连接池  
        SessionFactory factory = config.buildSessionFactory();  
        System.out.println(factory);  
    } 

}
