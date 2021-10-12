package com.videotag.services.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import com.videotag.entities.Video;
import com.videotag.repositories.VideoRepository;
import com.videotag.services.VideoService;

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