package com.fsoft.gst.ptithcm.tms.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fsoft.gst.ptithcm.tms.interceptor.LoginInterceptor;
	
/**
*Class WebMvcConfig mở rộng từ WebMvcConfigurerAdapter, sử dụng để cấu hình các tài nguyên sử dụng trong Spring MVC, 
*chẳng hạn các nguồn tài nguyên tĩnh (Image, CSS, Javascript,..)
**/
/**
 * The Class WebMvcConfig.
 * @author NVTT May 13, 2017
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
  
  
   /* (non-Javadoc)
    * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
    */
	 	@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	    }
	 
	 	/* (non-Javadoc)
		 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
		 */
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			super.addInterceptors(registry);
			
			
			//Interceptor ap dung cho moi URL
			registry.addInterceptor(new LoginInterceptor());
			
			
		}
    
   /* (non-Javadoc)
    * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
    */
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }
 
}