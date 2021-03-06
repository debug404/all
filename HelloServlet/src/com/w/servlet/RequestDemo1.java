package com.w.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo1
 */
@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

		InputStream in = request.getInputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) > -1) {
			String str = new String(by, 0, len);
			System.out.println(str);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 3 从request对象中取出请求数据

		// t1(request);
		// 3.2 请求头
		System.out.println(request.getHeader("Host"));// 根据头名称获取头内容
		Enumeration<String> enums = request.getHeaderNames();// 获取所有请求头列表
		while (enums.hasMoreElements()) {
			String headName = enums.nextElement();
			System.out.println(headName + ":" + request.getHeader(headName));
		}
		// 3.3 请求实体内容
		InputStream in = request.getInputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) > -1) {
			String str = new String(by, 0, len);
			System.out.println(str);
		}

		// 3.4 请求行

		// 3.5 请求行
	}

	private void t1(HttpServletRequest request) {
		// 3.1 请求行
		System.out.println("请求的方式" + request.getMethod());// 请求方式
		System.out.println("URI:" + request.getRequestURI());// 请求资源
		System.out.println("URL:" + request.getRequestURL());// 请求URL
		System.out.println("Http协议版本:" + request.getProtocol());// Http的版本号
	}

}
