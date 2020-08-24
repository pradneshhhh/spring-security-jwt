package com.security.jwt.repository;

import org.springframework.stereotype.Repository;

import com.security.jwt.dto.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByUserName(String username);
}
