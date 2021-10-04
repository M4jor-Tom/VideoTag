package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.videotag.entities.Sequence;

public interface SequenceRepository extends CrudRepository<Sequence, Integer> {

}