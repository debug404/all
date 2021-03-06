package com.w.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ShowIpTag extends SimpleTagSupport {

	private JspContext context;

	@Override
	public void setJspContext(JspContext pc) {
		this.context = pc;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// 向浏览器输出ip地址
		PageContext pageContext = (PageContext) context;
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
		String ip = request.getRemoteHost();
		JspWriter out = pageContext.getOut();
		out.write("ip地址为"+ip);

	}
}
