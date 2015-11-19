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
		// 3 ��request������ȡ����������

		// t1(request);
		// 3.2 ����ͷ
		System.out.println(request.getHeader("Host"));// ����ͷ���ƻ�ȡͷ����
		Enumeration<String> enums = request.getHeaderNames();// ��ȡ��������ͷ�б�
		while (enums.hasMoreElements()) {
			String headName = enums.nextElement();
			System.out.println(headName + ":" + request.getHeader(headName));
		}
		// 3.3 ����ʵ������
		InputStream in = request.getInputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) > -1) {
			String str = new String(by, 0, len);
			System.out.println(str);
		}

		// 3.4 ������

		// 3.5 ������
	}

	private void t1(HttpServletRequest request) {
		// 3.1 ������
		System.out.println("����ķ�ʽ" + request.getMethod());// ����ʽ
		System.out.println("URI:" + request.getRequestURI());// ������Դ
		System.out.println("URL:" + request.getRequestURL());// ����URL
		System.out.println("HttpЭ��汾:" + request.getProtocol());// Http�İ汾��
	}

}