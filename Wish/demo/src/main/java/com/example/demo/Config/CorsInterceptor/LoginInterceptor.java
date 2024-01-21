package com.example.demo.Config.CorsInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        Integer sessionId = (Integer) httpSession.getAttribute("uid");
        if (sessionId == null) {
            response.sendRedirect("/login"); // 重定向到新的网址
            return false;
        }
        return true;
    }
}
