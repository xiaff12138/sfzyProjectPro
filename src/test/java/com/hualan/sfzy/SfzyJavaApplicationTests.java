package com.hualan.sfzy;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SfzyJavaApplicationTests {

    @Autowired
    public DruidDataSource druidDataSource;
    @Test
    public void getDruidDataSourceInfo(){
        System.out.println("数据源对象:" + druidDataSource);
        System.out.println("初始连接数:" + druidDataSource.getInitialSize());
        System.out.println("最小连接数:" + druidDataSource.getMinIdle());
        System.out.println("最大连接数:" + druidDataSource.getMaxActive());
        System.out.println("最长等待时间:" + druidDataSource.getMaxWait());
    }
}
