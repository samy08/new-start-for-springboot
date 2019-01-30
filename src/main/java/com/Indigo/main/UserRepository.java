package com.Indigo.main;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Indigo.main.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
	UserEntity findUserByEmail(String email);
   List<UserEntity> findAll();
}
