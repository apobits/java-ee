package web.learning.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(value = "servletTwo")
public class ServletTwo extends HttpServlet {

    private final AtomicInteger atomicInteger = new AtomicInteger();
    private int counter;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().write("Thread: " + Thread.currentThread().getName() + "\n");
	synchronized (this) {
	    resp.getWriter().write("Integer variable: " + ++counter + "\n");
	}
	resp.getWriter().write("AtomicInteger variable: " + atomicInteger.incrementAndGet() + "\n");
    }
}
