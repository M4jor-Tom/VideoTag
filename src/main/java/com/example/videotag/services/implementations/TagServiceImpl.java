package com.example.videotag.services.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.videotag.entities.AbstractTag;
import com.example.videotag.repositories.TagRepository;
import com.example.videotag.services.TagService;

public class TagServiceImpl implements TagService {
	
	private TagRepository tagRepository;

	private TagRepository getTagRepository() {
		return tagRepository;
	}

	@Autowired
	private void setTagRepository(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

	@Override
	public List<AbstractTag> listAll() {
		return (List<AbstractTag>) getTagRepository().findAll();
	}

	@Override
	public AbstractTag getById(Integer id) throws NoSuchElementException {
		return getTagRepository().findById(id).get();
	}

	@Override
	public AbstractTag saveOrUpdate(AbstractTag abstractDomainClass) {
		return getTagRepository().save(abstractDomainClass);
	}

	@Override
	public void delete(Integer id) {
		getTagRepository().deleteById(id);
	}

}