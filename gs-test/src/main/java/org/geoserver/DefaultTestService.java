package org.geoserver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultTestService implements TestService {

	@Override
	public void getCapabilities(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.getOutputStream().write(
				("Hi " + name + " Hello World").getBytes());
	}

	@Override
	public void test(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println(name);
		response.getOutputStream().write(("Hi " + name + " Hello World").getBytes());
	}
}
