package com.example.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.model.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity , Integer>{

}
 