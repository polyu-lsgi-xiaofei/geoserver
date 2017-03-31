package org.geoserver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TestService {
	
	public void getCapabilities(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException;
	public void test(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException; 
}
