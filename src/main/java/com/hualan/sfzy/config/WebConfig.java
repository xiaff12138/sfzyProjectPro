package com.hualan.sfzy.config;

import com.hualan.sfzy.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    // 定义一个方法，返回自定义拦截器对象，并加入IOC容器中
    @Bean
    public HandlerInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLoginInterceptor()) // 注册拦截器
                .addPathPatterns("/**")                // 拦截的路径,/** 表示所有层级的所有路径都会进入拦截器
                .excludePathPatterns("/", "/login", "/index", "/index.html",
                        "/auth/login", "/webjars/**", "/static/**"); //不拦截的路径
    }
}

