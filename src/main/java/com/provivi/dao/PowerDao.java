package com.provivi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.provivi.model.Power;

@Repository
public interface PowerDao extends JpaRepository<Power, Integer>{ }
