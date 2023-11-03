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
import com.smilehub.schatmig.util.CommonUtil;

@RestController
@RequestMapping(value = "/user")
public class SendBirdUsers {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/count")
	public UserParam getUserCount(@PathVariable String userType){
	    // 데이터베이스 연동이 따로 되어있는 것이 없기 때문에 임시적으로 객체를 생성해서 넘겨줌
	    return null;
	}	  
}
