package com.koreait.server;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

// 1개의 Servlet 은 각각 1개의 GET, POST 를 가질 수 있다.
// GET 방식 : 쿼리 스트링을 통해 데이터 전송, 빠르지만 노출된다, 스트링 값 제한이 있다.(대부분 GET 방식 사용)
// POST 방식 : 캡슐화를 통해 데이터 전송, 느리지만 노출방지(보안이 뛰어남), 데이터를 많이 보내야할 때 사용(+ 파일 업로드, 회원가입, 로그인 등)
@WebServlet("/hi")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");//쿼리스트링 뿐만 아니라 뭔가 데이터를 받을 때 쓰는 매소드 getParameter
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        PrintWriter out = res.getWriter();
        out.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String age = req.getParameter("age");//쿼리스트링 뿐만 아니라 뭔가 데이터를 받을 때 쓰는 매소드 getParameter
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }







}
