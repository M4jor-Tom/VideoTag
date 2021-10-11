package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.videotag.entities.AbstractTag;

@Repository
public interface TagRepository extends CrudRepository<AbstractTag, Integer> {

}