package com.rm.spring.concepts.config.configprops;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "file")
@PropertySource("classpath:rm-file.properties")
public class FileProperties {

	private Integer maxSize;
	private List<String> validExtensions;
	
	public Integer getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
	public List<String> getValidExtensions() {
		return validExtensions;
	}
	public void setValidExtensions(List<String> validExtensions) {
		this.validExtensions = validExtensions;
	}

	@Override
	public String toString() {
		return "RMProperties [maxSize=" + maxSize + ", validExtensions=" + validExtensions + "]";
	}
	
}
