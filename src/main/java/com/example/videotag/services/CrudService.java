package com.example.videotag.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.videotag.domain.VideoTagDomainClass;

@Service
public interface CrudService<T extends VideoTagDomainClass> {
    List<T> listAll();

    T getById(Integer id);

    T saveOrUpdate(T abstractDomainClass);

    void delete(Integer id);
}