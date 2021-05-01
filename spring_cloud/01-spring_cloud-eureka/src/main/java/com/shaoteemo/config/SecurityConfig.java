//package com.shaoteemo.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * 所属项目：microservice
// * 所属包：com.shaoteemo.config
// *
// * @author ShaoTeemo
// * @since 2021/5/1
// */
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        //关闭CSRF否则无法登录
//        http.csrf().disable();
//    }
//}
