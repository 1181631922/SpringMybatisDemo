package com.fanyafeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Author： fanyafeng
 * Data： 16/10/25 14:40
 * Email: fanyafeng@live.cn
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(HttpSession httpSession, String username, String password) {
        httpSession.setAttribute("username", username);
        httpSession.setAttribute("password", password);
        return "redirect:items/itemsList";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:items/itemsList";
    }
}
