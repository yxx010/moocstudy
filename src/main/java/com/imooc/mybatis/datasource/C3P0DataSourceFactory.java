package com.imooc.mybatis.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * c3p0与mybatis兼容使用的数据源工厂类
 */
public class C3P0DataSourceFactory extends UnpooledDataSourceFactory {
    public C3P0DataSourceFactory(){
        this.dataSource=new ComboPooledDataSource();
    }
}
