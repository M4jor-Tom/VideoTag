package com.videotag.entities;

import java.io.File;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jpaentitor.entities.AbstractEntity;

@Entity
public class Video extends AbstractEntity {
	private File file;
	@OneToMany
	private List<Compilation> sequenceList;
	@OneToMany
	private List<AbstractTag> tagList;
	
	public Video(File file, List<Compilation> sequenceList, List<AbstractTag> tagList) {
		super();
		setFile(file);
		setSequenceList(sequenceList);
		setTagList(tagList);
	}
	
	public File getFile() {
		return file;
	}
	
	private void setFile(File file) {
		this.file = file;
	}
	
	public List<Compilation> getSequenceList() {
		return sequenceList;
	}
	
	private void setSequenceList(List<Compilation> sequenceList) {
		this.sequenceList = sequenceList;
	}
	
	public List<AbstractTag> getTagList() {
		return tagList;
	}

	private void setTagList(List<AbstractTag> tagList) {
		this.tagList = tagList;
	}
}