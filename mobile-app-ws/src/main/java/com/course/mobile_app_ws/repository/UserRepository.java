package com.course.mobile_app_ws.repository;

import com.course.mobile_app_ws.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
