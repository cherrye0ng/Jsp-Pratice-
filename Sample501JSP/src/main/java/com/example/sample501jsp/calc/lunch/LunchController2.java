package com.example.sample501jsp.calc.lunch;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "lunchController2", urlPatterns = "/lunch-result")
public class LunchController2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 로그인 처리 후, 메인으로 이동.
        // 디비 연결도 없고, dao,dto 등 서비스 가 없어서, 단순
        // 메인으로 이동만했음. lsy, 1234 , 메인으로 , 아니면 로그인 폼으로 이동.
        System.out.println("lunch-result 받기, post 로 받기");
        String menu = req.getParameter("menu");

        if (menu.equals("mac")) {
            // 메인, index 로가기.
            System.out.println("mac");
            resp.sendRedirect("/");
        } else {
            // 다르면, 메인폼으로 가기.
            resp.sendRedirect("/lunch");
        }


    }
}



