package com.spring.content.negotiation.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.content.negotiation.api.dto.User;

@RestController
public class UserController {

	@PostMapping(value = "/getUserInXml", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public User getUserInXml(@RequestBody User user) {
		return user;
	}

}
