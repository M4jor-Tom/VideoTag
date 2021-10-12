package com.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.videotag.entities.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video, Integer> {

}