package com.w.servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.w.pojo.Files;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class getJson
 */
@WebServlet("/getJson.do")
public class getJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int i = 0;
	public ArrayList<Files> flist;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void getFile(File file, List<Files> lists) {

		File[] files = file.listFiles();
		if(files==null||files.length==0){
			return;
		}
		for (File f : files) {
			if (f.isDirectory()) {
				Files fs2 = new Files();
				fs2.setId("22");
				fs2.setState("closed");
				try {
					fs2.setText(new String(f.getName().getBytes("utf-8"), "ISO8859-1"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List<Files> fs22 = new ArrayList<Files>();
				fs2.setChildren(fs22);
				lists.add(fs2);

				getFile(f, fs22);

			} else {

				Files fs1 = new Files();
				fs1.setId("22");
				fs1.setState("");
				try {
					fs1.setText(new String(f.getName().getBytes("utf-8"), "ISO8859-1"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				fs1.setChildren(null);
				lists.add(fs1);
			}

		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=this.getServletContext().getInitParameter("path");
		File file = new File(path);
		flist = new ArrayList<Files>();
		getFile(file, flist);
		Files fis = new Files("1", new String("我的资源管理器".getBytes("utf-8"), "ISO8859-1"), "close", flist);
		JSONArray objArr = JSONArray.fromObject(fis);
		response.getWriter().write(objArr.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
