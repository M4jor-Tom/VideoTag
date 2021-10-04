package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.videotag.entities.AbstractTag;

public interface TagRepository extends CrudRepository<AbstractTag, Integer> {

}