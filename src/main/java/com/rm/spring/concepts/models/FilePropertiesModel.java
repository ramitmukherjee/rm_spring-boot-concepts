package com.rm.spring.concepts.models;

import java.util.List;

public class FilePropertiesModel {

	private Integer maxSize;
	private List<String> validExtensions;

	public FilePropertiesModel() {
		super();
	}

	public FilePropertiesModel(Integer maxSize, List<String> validExtensions) {
		super();
		this.maxSize = maxSize;
		this.validExtensions = validExtensions;
	}

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
