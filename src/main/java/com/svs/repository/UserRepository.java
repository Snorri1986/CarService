package com.svs.repository;

import com.svs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Description: Interface for fetch user's name(DAO)
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
public interface UserRepository extends JpaRepository<User,String> {
List<User> findAll();
}
