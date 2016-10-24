package com.fanyafeng.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author： fanyafeng
 * Data： 16/10/24 10:30
 * Email: fanyafeng@live.cn
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {

        CustomException customException = null;
        if (e instanceof CustomException) {
            customException = (CustomException) e;
        } else {
            customException = new CustomException("未知错误");
        }

        String message = customException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", message);
        modelAndView.setViewName("error");


        return modelAndView;
    }
}
