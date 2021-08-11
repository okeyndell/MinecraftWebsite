package com.github.lkapitman.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { ApplicationContextConfiguration.class };
    
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  
}
