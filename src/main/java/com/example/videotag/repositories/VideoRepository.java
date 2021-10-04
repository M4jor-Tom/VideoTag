package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.videotag.entities.Video;

public interface VideoRepository extends CrudRepository<Video, Integer> {

}