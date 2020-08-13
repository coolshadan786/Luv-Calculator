package com.springFrame.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LuvCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//1st Approach to create a java class instead of as a XML file using implementation of (implements WebApplicationInitializer)
			//Devloper has the complete control over the DispathcerServlet Object
		
		System.out.println("My custom class onstartup method called>>>>> Umair");

		//1st mtdh - using xml file -> This (application-config.xml)xml file exist in resources pkg for providing scanning component scan of class in the given location.
		
//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();		
//		webApplicationContext.setConfigLocation("classpath:application-config.xml");		
		
		//2nd mtdh - using java config class -> Instead of (application-config.xml)xml file create a java config class(LuvCalculatorAppConfig) exist in resources pkg for providing scanning component scan of class in the given location
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();		
		webApplicationContext.register(LuvCalculatorAppConfig.class);
		
		//create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		//register the dispatcher servlet with the servlet context object
		ServletRegistration.Dynamic myCustomDispatcherServlet =  servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomDispatcherServlet.setLoadOnStartup(1);					//used for Load on tag 1 times for dispatcherServlet class to initialized it.
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");			//giving the url path for finding class with the name of url tag name passes in for class
			
		
	}

}
