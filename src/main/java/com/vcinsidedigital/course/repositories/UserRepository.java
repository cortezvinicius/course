package com.vcinsidedigital.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcinsidedigital.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
