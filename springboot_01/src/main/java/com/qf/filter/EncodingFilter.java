package com.qf.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//复写方法 alt+enter
public class EncodingFilter implements Filter {
   private  String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding=filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("EncodingFilter.doFilter 之前");
        // 1.先要做类型转换
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        // 2.设置编码
        request.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset="+encoding);
        // 3.往下调用
        filterChain.doFilter(request,response);
        System.out.println("EncodingFilter.doFilter之后");
    }

    @Override
    public void destroy() {

    }
}
