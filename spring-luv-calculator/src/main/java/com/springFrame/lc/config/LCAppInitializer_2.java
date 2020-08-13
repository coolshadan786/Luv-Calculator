package com.springFrame.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer_2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	//2nd Approach to create a java class instead of as a XML file using extending (extends AbstractAnnotationConfigDispatcherServletInitializer)
		//Spring is taking control & creating the DispatcherServlet Object for us.
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class arr[]= {LuvCalculatorAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[]= {"/"};
		return arr;
	}

}
