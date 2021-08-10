package com.rm.spring.concepts.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.rm.spring.concepts.config.configprops.FileProperties;
import com.rm.spring.concepts.services.PropertyInjectionDemoService;

@Service
@PropertySource("classpath:rm-file.properties")
public class PropertyInjectionDemoServiceImpl implements PropertyInjectionDemoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertyInjectionDemoServiceImpl.class);

	@Value("${file.max-size}")
	Integer maxSize;

	@Value("${file.valid-extensions}")
	List<String> validExtensions;

	@Autowired
	FileProperties fileProperties;

	@Override
	public String usingValueAnnotation() {
		LOGGER.info("----------------------");

		LOGGER.info("@Value Max Size: {}", this.maxSize);
		LOGGER.info("@Value Valid Extensions: {}", this.validExtensions);

		LOGGER.info("----------------------");
		return String.format("maxSize: %s; validExtensions: %s", this.maxSize, this.validExtensions);
	}

	@Override
	public FileProperties usingConfigurationPropertiesAnnotation() {
		LOGGER.info("----------------------");

		LOGGER.info("@ConfigurationProperties Max Size: {}", fileProperties.getMaxSize());
		LOGGER.info("@ConfigurationProperties  Valid Extensions: {}", fileProperties.getValidExtensions());

		LOGGER.info("----------------------");
		
		return fileProperties;
	}

}
