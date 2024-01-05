package org.example.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet")
public class TestServlet extends HttpServlet {

    private String message;

    private static final long serialVersionUID = 1L;
    public void init()   {
      // Do required initialization
      message = "Hello World";
   }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().append("Hello! How are you today?\n");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        doGet(request, response);
    }
}
