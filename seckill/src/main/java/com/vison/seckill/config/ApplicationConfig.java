package com.vison.seckill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 × description: spring应用配置
 *
 * @author Vison 2017年4月2日
 */
@Configuration
@ImportResource("classpath:spring/application-db.xml")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ApplicationConfig {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourceHolder = new PropertySourcesPlaceholderConfigurer() ; 
		Resource[] resources = new Resource[]{new ClassPathResource("db-config.properties")} ;
		propertySourceHolder.setLocations(resources);
		return propertySourceHolder ; 
	}
	
}
