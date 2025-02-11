package com.c203.altteulbe.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.openvidu.java.client.OpenVidu;

@Configuration
public class OpenViduConfig {
	@Value("${openvidu.url}")
	private String OPENVIDU_URL;

	@Value("${openvidu.secret}")
	private String OPENVIDU_SECRET;

	@Bean
	public OpenVidu openVidu() {
		return new OpenVidu(OPENVIDU_URL, OPENVIDU_SECRET);
	}

}
