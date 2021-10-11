package com.example.videotag.services.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.videotag.entities.Video;
import com.example.videotag.repositories.VideoRepository;
import com.example.videotag.services.VideoService;

public class VideoServiceImpl implements VideoService {

	private VideoRepository videoRepository;

	public VideoRepository getVideoRepository() {
		return videoRepository;
	}

	public void setVideoRepository(VideoRepository videoRepository) {
		this.videoRepository = videoRepository;
	}
	
	@Override
	public List<Video> listAll() {
		return (List<Video>) getVideoRepository().findAll();
	}

	@Override
	public Video getById(Integer id) throws NoSuchElementException {
		return getVideoRepository().findById(id).get();
	}

	@Override
	public Video saveOrUpdate(Video abstractDomainClass) {
		return getVideoRepository().save(abstractDomainClass);
	}

	@Override
	public void delete(Integer id) {
		getVideoRepository().deleteById(id);
	}
}