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
	PropertyInjectionDemoService runService;
	
	@GetMapping("/value")
	public String usingValueAnnotation() {
		return runService.usingValueAnnotation();
	}
	
	@GetMapping("/config-prop")
	public FilePropertiesModel usingConfigurationPropertyAnnotation() {
		FileProperties fp = runService.usingConfigurationPropertiesAnnotation();
		return new FilePropertiesModel(fp.getMaxSize(), fp.getValidExtensions());
	}
	
}
