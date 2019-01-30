package com.Indigo.main.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Indigo.main.UserRepository;
import com.Indigo.main.dto.IndigoDto;
import com.Indigo.main.entity.UserEntity;
import com.Indigo.main.service.IndigoServices;


@Service
public class IndigoServiceImpl implements IndigoServices {
    @Autowired
	UserRepository userRepo;
    
	@Override 
	public IndigoDto createUser(IndigoDto user) {
		
		UserEntity entity=new UserEntity();
		BeanUtils.copyProperties(user, entity);
		//entity.setUsername("samy08");
		UserEntity storedUser=userRepo.save(entity);
		IndigoDto dto=new IndigoDto();
		BeanUtils.copyProperties(storedUser,dto);
		return dto;
	}

	@Override
	public List<IndigoDto> getAllUsers() {
		// TODO Auto-generated method stub
		IndigoDto dto=new IndigoDto();
		List<IndigoDto> users=new ArrayList<IndigoDto>();    
		for(UserEntity entity: userRepo.findAll()) {
			BeanUtils.copyProperties(entity, dto);
			users.add(dto);
			
		}
		return users;
	}

}
