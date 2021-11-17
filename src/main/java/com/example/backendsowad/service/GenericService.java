package com.example.backendsowad.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T extends Serializable>{
    List<T> findAll();

    T findById(Long id);

    void save(T entity);

    void deleteById(Long id);
}
