package com.sanyang.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
	private String encoding;
	
	@Override
	public void init(FilterConfig fc) throws ServletException {
		String encoding = fc.getInitParameter("encoding");
		this.encoding= encoding;
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		arg0.setCharacterEncoding(encoding);
		arg1.setCharacterEncoding(encoding);
		
		HttpServletRequest req = (HttpServletRequest)arg0;
		req.setCharacterEncoding(encoding);
		
		arg2.doFilter(req, arg1);
		
	}

	
	

}
