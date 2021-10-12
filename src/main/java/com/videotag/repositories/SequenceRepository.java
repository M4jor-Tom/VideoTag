package com.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.videotag.entities.Sequence;

@Repository
public interface SequenceRepository extends CrudRepository<Sequence, Integer> {

}