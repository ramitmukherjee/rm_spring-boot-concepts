package com.rm.spring.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.spring.concepts.services.PropertyInjectionDemoService;

@RestController
@RequestMapping("/prop")
public class PropertyInjectionDemoController {

	@Autowired
	PropertyInjectionDemoService runService;
	
	@GetMapping("/value")
	public String usingValueAnnotation() {
		runService.runUploadedFiles();
		return "Uploaded Files Staged";
		
	}
	
	@GetMapping("/config-prop")
	public String usingConfigurationPropertyAnnotation() {
		runService.runUploadedFiles();
		return "Uploaded Files Staged";
		
	}
	
}
