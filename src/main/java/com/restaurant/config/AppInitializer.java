package com.restaurant.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This class is to register a DispatcherServlet
 * 
 * @author thuan
 *
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Specify the Application Config
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class[] { AppConfig.class };
    }

    /**
     * Specify the Servlet Config
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
	return null;
    }

    /**
     * Specify the servlet mappings
     */
    @Override
    protected String[] getServletMappings() {
	return new String[] { "/" };
    }

}
