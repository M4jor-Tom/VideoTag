package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.videotag.entities.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video, Integer> {

}