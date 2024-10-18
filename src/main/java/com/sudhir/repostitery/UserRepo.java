package com.sudhir.repostitery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudhir.entites.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
