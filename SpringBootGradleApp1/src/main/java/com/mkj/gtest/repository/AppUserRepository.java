package com.mkj.gtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer>
{
 // no code at all
}