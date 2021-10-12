package com.videotag.services.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.videotag.entities.Compilation;
import com.videotag.repositories.CompilationRepository;
import com.videotag.services.CompilationService;

public class CompilationServiceImpl implements CompilationService {

	private CompilationRepository sequenceRepository;
	
	private CompilationRepository getSequenceRepository() {
		return sequenceRepository;
	}

	@Autowired
	private void setSequenceRepository(CompilationRepository sequenceRepository) {
		this.sequenceRepository = sequenceRepository;
	}

	@Override
	public List<Compilation> listAll() {
		return (List<Compilation>) getSequenceRepository().findAll();
	}

	@Override
	public Compilation getById(Integer id) throws NoSuchElementException {
		return getSequenceRepository().findById(id).get();
	}

	@Override
	public Compilation saveOrUpdate(Compilation abstractDomainClass) {
		return getSequenceRepository().save(abstractDomainClass);
	}

	@Override
	public void delete(Integer id) {
		getSequenceRepository().deleteById(id);
	}

}