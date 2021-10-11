package com.example.videotag.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import jpaentitor.entities.AbstractEntity;

@Entity
public class Sequence extends AbstractEntity {
	@ManyToOne
	private Video video;
	@ManyToMany
	private List<AbstractTag> tagList;
	
	public Sequence(Video video, List<AbstractTag> tagList) {
		super();
		setVideo(video);
		setTagList(tagList);
	}
	
	public Video getVideo() {
		return video;
	}
	
	private void setVideo(Video video) {
		this.video = video;
	}
	
	public List<AbstractTag> getTagList() {
		return tagList;
	}
	
	private void setTagList(List<AbstractTag> tagList) {
		this.tagList = tagList;
	}
}