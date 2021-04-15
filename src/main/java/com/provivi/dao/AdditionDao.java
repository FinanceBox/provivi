package com.provivi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.provivi.model.Addition;

@Repository
public interface AdditionDao extends JpaRepository<Addition, Integer> { }
