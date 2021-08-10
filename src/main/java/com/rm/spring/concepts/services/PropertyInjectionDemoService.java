package com.rm.spring.concepts.services;

import com.rm.spring.concepts.config.configprops.FileProperties;

public interface PropertyInjectionDemoService {

	public String usingValueAnnotation();
	public String usingEnvironmentObject();
	public FileProperties usingConfigurationPropertiesAnnotation();
	
}
