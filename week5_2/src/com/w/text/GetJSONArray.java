package com.w.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class GetJSONArray
 */
@WebServlet("/GetJSONArray.do")
public class GetJSONArray extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONObject object = JSONObject.fromObject(new CodeLanguage("1", "java", "run anywhere"));
		response.setContentType("text/html;charset=utf-8");
		List<CodeLanguage> obj = new ArrayList<CodeLanguage>();
		obj.add(new CodeLanguage("2", "html", "don't know"));
		obj.add(new CodeLanguage("3", "Jquery", "do more"));
		JSONArray jsonArr = JSONArray.fromObject(obj);

//		response.getWriter().write(object.toString());
		response.getWriter().write(jsonArr.toString());
	}

}
