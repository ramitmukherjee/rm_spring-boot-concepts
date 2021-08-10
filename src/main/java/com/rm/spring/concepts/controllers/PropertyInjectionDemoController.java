package com.rm.spring.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.spring.concepts.config.configprops.FileProperties;
import com.rm.spring.concepts.models.FilePropertiesModel;
import com.rm.spring.concepts.services.PropertyInjectionDemoService;

@RestController
@RequestMapping("/prop")
public class PropertyInjectionDemoController {

	@Autowired
	PropertyInjectionDemoService propertyInjectionDemoService;
	
	@GetMapping("/value")
	public String usingValueAnnotation() {
		return propertyInjectionDemoService.usingValueAnnotation();
	}
	
	@GetMapping("/config-prop")
	public FilePropertiesModel usingConfigurationPropertyAnnotation() {
		FileProperties fp = propertyInjectionDemoService.usingConfigurationPropertiesAnnotation();
		return new FilePropertiesModel(fp.getMaxSize(), fp.getValidExtensions());
	}
	
	@GetMapping("/environment")
	public String usingEnvironmentObject() {
		return this.propertyInjectionDemoService.usingEnvironmentObject();
	}
	
}
