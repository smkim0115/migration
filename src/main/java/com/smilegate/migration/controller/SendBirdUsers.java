package com.smilegate.migration.controller;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smilegate.migration.dto.UserDto;
import com.smilegate.migration.dto.UserParam;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class SendBirdUsers {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/count")
	public UserParam getUserCount(HttpServletRequest request){
        // 테스트 /Request 확인 
		logger.info(request.toString()) ; 
		
	    return null;
	}	  
}
