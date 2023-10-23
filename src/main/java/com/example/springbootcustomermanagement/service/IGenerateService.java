package com.example.springbootcustomermanagement.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void remote(Long id);
}
//interface IGenerateService -> Tao cac phuong thuc chung