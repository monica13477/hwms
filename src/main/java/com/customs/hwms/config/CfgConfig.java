package com.customs.hwms.config;

import com.alibaba.druid.pool.DruidDataSource;
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

import javax.sql.DataSource;
import java.io.File;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.customs.hwms.dao.cfg", sqlSessionFactoryRef = "cfgSqlSessionFactory")
public class CfgConfig {
    // 精确到 master 目录，以便跟其他数据源隔离
    static final String MAPPER_LOCATION = "classpath:mapper"+ File.separator+"cfg"+ File.separator+"*.xml";

    @Value("${datasource.cfg.url}")
    private String url;
    @Value("${datasource.cfg.username}")
    private String user;
    @Value("${datasource.cfg.password}")
    private String password;
    @Value("${datasource.cfg.driver-class-name}")
    private String driverClass;

    @Value("${datasource.cfg.maxActive}")
    private Integer maxActive;
    @Value("${datasource.cfg.minIdle}")
    private Integer minIdle;
    @Value("${datasource.cfg.initialSize}")
    private Integer initialSize;
    @Value("${datasource.cfg.maxWait}")
    private Long maxWait;
    @Value("${datasource.cfg.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;
    @Value("${datasource.cfg.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;
    @Value("${datasource.cfg.testWhileIdle}")
    private Boolean testWhileIdle;
    @Value("${datasource.cfg.testWhileIdle}")
    private Boolean testOnBorrow;
    @Value("${datasource.cfg.testOnBorrow}")
    private Boolean testOnReturn;

    @Bean(name = "cfgDataSource")
    @Primary
    public DataSource cfgDataSource() {
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

    @Bean(name = "cfgTransactionManager")
    @Primary
    public DataSourceTransactionManager cfgTransactionManager() {
        return new DataSourceTransactionManager(cfgDataSource());
    }

    @Bean(name = "cfgSqlSessionFactory")
    @Primary
    public SqlSessionFactory cfgSqlSessionFactory(@Qualifier("cfgDataSource") DataSource cfgDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(cfgDataSource);
        sessionFactory.setTypeAliasesPackage("com.customs.hwms.dao.cfg");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CfgConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
