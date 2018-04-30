package com.kickcity.task.blogmanagement.repository;

import com.kickcity.task.blogmanagement.model.Record;
import com.kickcity.task.blogmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
