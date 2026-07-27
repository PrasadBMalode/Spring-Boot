package com.example.userManagement.repository;

import com.example.userManagement.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long>
{
}
