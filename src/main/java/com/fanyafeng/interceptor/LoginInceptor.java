package com.fanyafeng.interceptor;

import org.apache.ibatis.javassist.compiler.MemberResolver;
import org.apache.ibatis.javassist.expr.Handler;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Author： fanyafeng
 * Data： 16/10/25 10:58
 * Email: fanyafeng@live.cn
 */
public class LoginInceptor implements HandlerInterceptor {
    //    进入handler之前执行
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURI();

        if (url.contains("login")) {
            return true;
        }

        if (accessRequired((HandlerMethod) o)) {
            return true;
        }

        HttpSession httpSession = httpServletRequest.getSession();
        String username = (String) httpSession.getAttribute("username");
        if (username != null) {
            return true;
        }
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;//true表示放行
    }

    //进入handler方法之后,返回modelandview之前执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //    执行handler完成执行此方法
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    private boolean accessRequired(HandlerMethod handlerMethod) {
        Method method = handlerMethod.getMethod();
        AccessRequired annotation = method.getAnnotation(AccessRequired.class);
        if (annotation != null && !annotation.required()) {
            return true;
        } else {
            return false;
        }
    }


}
