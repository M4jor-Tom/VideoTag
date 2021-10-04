package com.example.videotag.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.videotag.domain.VideoTagDomainClass;

@Service
public interface CrudService<T extends VideoTagDomainClass> {
    List<T> listAll();

    T getById(Integer id) throws NoSuchElementException;

    T saveOrUpdate(T abstractDomainClass);

    void delete(Integer id);
}