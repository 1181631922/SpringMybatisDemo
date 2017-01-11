package com.fanyafeng.interceptor;

import java.lang.annotation.*;

/**
 * Author： fanyafeng
 * Data： 17/1/4 13:55
 * Email: fanyafeng@live.cn
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AccessRequired {
    public boolean required() default true;

    public String redirectURL() default "";

    public final String REDIRECT_LOGIN = "";
}
