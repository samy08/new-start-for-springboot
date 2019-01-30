package com.Indigo.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Indigo.main.dto.IndigoDto;
import com.Indigo.main.request.GetUsersReques;
import com.Indigo.main.response.GetUsersResponse;
import com.Indigo.main.service.IndigoServices;

@RestController
@RequestMapping("Indigo")
public class Controller {
	@Autowired
	IndigoServices service;
	
	@GetMapping
	public List<GetUsersResponse> getUsers() {
		List<GetUsersResponse> listOfUsers=new ArrayList<GetUsersResponse>();
		List<IndigoDto> existingUsersFromDB=service.getAllUsers();
		BeanUtils.copyProperties(existingUsersFromDB, listOfUsers);
		return listOfUsers;
		
	}
	
	
	@PostMapping
	public GetUsersResponse createUser(@RequestBody GetUsersReques newUser) {
		GetUsersResponse createdUser=new GetUsersResponse();
		IndigoDto dto=new IndigoDto();
		BeanUtils.copyProperties(newUser, dto);
		dto=service.createUser(dto);
		BeanUtils.copyProperties(dto,createdUser);
		return createdUser;
	}
}


