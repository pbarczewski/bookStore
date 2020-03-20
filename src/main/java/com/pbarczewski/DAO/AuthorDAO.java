package com.pbarczewski.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbarczewski.entity.Author;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {

}
