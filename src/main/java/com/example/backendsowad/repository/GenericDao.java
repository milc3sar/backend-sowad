package com.example.backendsowad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericDao<T extends Serializable> extends JpaRepository<T, Long> {
}
