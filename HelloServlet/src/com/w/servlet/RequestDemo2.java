package com.w.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo2
 */
@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET");
		String str = request.getQueryString();
		System.out.println(str);

		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("name=" + name + "---password=" + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InputStream in = request.getInputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) > -1) {
			String str = new String(by, 0, len);
			System.out.println(str);
		}

	}

}
