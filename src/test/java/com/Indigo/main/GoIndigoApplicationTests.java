package com.Indigo.main;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Indigo.main.dto.IndigoDto;
import com.Indigo.main.entity.UserEntity;
import com.Indigo.main.service.IndigoServices;
import com.Indigo.main.serviceImplementation.IndigoServiceImpl;

@RunWith(MockitoJUnitRunner.class)

public class GoIndigoApplicationTests {

	@Mock
	UserEntity dto;
	
	@Mock
	 UserRepository userRepo;
	
	IndigoServices service=new IndigoServiceImpl();
	
	@Test
	public void contextLoads() {
		dto.setAge(26);
		dto.setEmail("sameera.yerra@gmail.com");
		dto.setFirstName("Sameera");
		dto.setLastName("yerra");
		dto.setPassword("sameera");
		dto.setSex("f");
		dto.setUsername("sameera");
		List<UserEntity> dtoList=new ArrayList<UserEntity>();
		dtoList.add(dto);
		when(userRepo.findAll()).thenReturn(dtoList);
		assertEquals(1,userRepo.findAll().size());
		//assertEquals(1,service.getAllUsers());
		
		
	}

}

