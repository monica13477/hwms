package com.customs.hwms.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.File;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.customs.hwms.dao.bus", sqlSessionFactoryRef = "busSqlSessionFactory")
public class BusinessConfig {
    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "bus";
    static final String MAPPER_LOCATION = "classpath:mapper"+ File.separator+"bus"+ File.separator+"*.xml";

    @Value("${datasource.bus.url}")
    private String url;
    @Value("${datasource.bus.username}")
    private String user;
    @Value("${datasource.bus.password}")
    private String password;
    @Value("${datasource.bus.driver-class-name}")
    private String driverClass;

    @Value("${datasource.bus.maxActive}")
    private Integer maxActive;
    @Value("${datasource.bus.minIdle}")
    private Integer minIdle;
    @Value("${datasource.bus.initialSize}")
    private Integer initialSize;
    @Value("${datasource.bus.maxWait}")
    private Long maxWait;
    @Value("${datasource.bus.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;
    @Value("${datasource.bus.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;
    @Value("${datasource.bus.testWhileIdle}")
    private Boolean testWhileIdle;
    @Value("${datasource.bus.testWhileIdle}")
    private Boolean testOnBorrow;
    @Value("${datasource.bus.testOnBorrow}")
    private Boolean testOnReturn;

    @Bean(name = "busDataSource")
    @Primary
    public DataSource busDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        //连接池配置
        dataSource.setMaxActive(maxActive);
        dataSource.setMinIdle(minIdle);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setValidationQuery("SELECT 'x'");

        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);

        return dataSource;
    }

    @Bean(name = "busTransactionManager")
    @Primary
    public DataSourceTransactionManager busTransactionManager() {
        return new DataSourceTransactionManager(busDataSource());
    }

    @Bean(name = "busSqlSessionFactory")
    public SqlSessionFactory busSqlSessionFactory(@Qualifier("busDataSource") DataSource busDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(busDataSource);
        sessionFactory.setTypeAliasesPackage("com.customs.hwms.dao.bus");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(BusinessConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
