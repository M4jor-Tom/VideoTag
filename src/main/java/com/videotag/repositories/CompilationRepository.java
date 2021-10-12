package com.videotag.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.videotag.entities.Compilation;

@Repository
public interface CompilationRepository extends CrudRepository<Compilation, Integer> {

}