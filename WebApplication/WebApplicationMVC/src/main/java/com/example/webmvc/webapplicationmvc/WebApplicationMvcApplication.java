package com.example.webmvc.webapplicationmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class WebApplicationMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationMvcApplication.class, args);
    }

    @WebServlet(urlPatterns = "/login.do")
    public class LoginServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Yahoo!!!!!!!!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("My First Servlet");
            out.println("</body>");
            out.println("</html>");

        }

    }

}
