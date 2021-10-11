package com.example.videotag.services.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.videotag.entities.Sequence;
import com.example.videotag.repositories.SequenceRepository;
import com.example.videotag.services.SequenceService;

public class SequenceServiceImpl implements SequenceService {

	private SequenceRepository sequenceRepository;
	
	private SequenceRepository getSequenceRepository() {
		return sequenceRepository;
	}

	@Autowired
	private void setSequenceRepository(SequenceRepository sequenceRepository) {
		this.sequenceRepository = sequenceRepository;
	}

	@Override
	public List<Sequence> listAll() {
		return (List<Sequence>) getSequenceRepository().findAll();
	}

	@Override
	public Sequence getById(Integer id) throws NoSuchElementException {
		return getSequenceRepository().findById(id).get();
	}

	@Override
	public Sequence saveOrUpdate(Sequence abstractDomainClass) {
		return getSequenceRepository().save(abstractDomainClass);
	}

	@Override
	public void delete(Integer id) {
		getSequenceRepository().deleteById(id);
	}

}