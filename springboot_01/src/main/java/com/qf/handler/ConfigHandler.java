package com.qf.handler;

import com.qf.entity.User;
import com.qf.filter.EncodingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;

@Configuration
public class ConfigHandler {

   // @Bean
    public User user(){
        User user=new User(1,"admin",18);
        return  user;
    }
    // FilterRegistrationBean:注册过滤器
    @Bean
    public FilterRegistrationBean<Filter> encodingFilrer(){
        System.out.println("注册Filter");
        // 1.创建注册过滤器的bean
        FilterRegistrationBean<Filter> rg = new FilterRegistrationBean<Filter>();
        // 2.设置过滤器的名称
        rg.setName("encodingFilter");
        // 3.设置过滤器
        rg.setFilter(new EncodingFilter());

        // 4.设置初始化的参数
        rg.addInitParameter("encoding","utf-8");

        // 5.设置拦截的路径
        rg.addUrlPatterns("/*");
      return rg;
    }

}
