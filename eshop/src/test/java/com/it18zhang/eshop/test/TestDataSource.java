package com.it18zhang.eshop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDataSource {
    /**
     * 测试是否连接成功
     */
    @Test
    public void getConn() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource ds = (DataSource) ac.getBean("dataSource");
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
