package com.example.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.videotag.entities.Sequence;

@Repository
public interface SequenceRepository extends CrudRepository<Sequence, Integer> {

}