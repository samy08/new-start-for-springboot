package com.Indigo.main.service;

import java.util.List;

import com.Indigo.main.dto.IndigoDto;


public interface IndigoServices {
     public IndigoDto createUser(IndigoDto user) ;
     public List<IndigoDto> getAllUsers();
}
