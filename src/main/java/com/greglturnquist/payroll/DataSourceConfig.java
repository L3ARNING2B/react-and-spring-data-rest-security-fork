//package com.greglturnquist.payroll;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Bean(name = "dataSource")
//    public DriverManagerDataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/usersdb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("secret");
//        return dataSource;
//    }
//}
