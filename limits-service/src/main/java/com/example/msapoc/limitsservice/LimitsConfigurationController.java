package com.example.msapoc.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msapoc.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration() {
//		return new LimitConfiguration(100, 1);	// 하드코딩
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
