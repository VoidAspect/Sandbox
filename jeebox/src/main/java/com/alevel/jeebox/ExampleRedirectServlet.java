package com.alevel.jeebox;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example")
public class ExampleRedirectServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("!!! Example Servlet Initialized !!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.sendRedirect("https://example.com");
    }
}
