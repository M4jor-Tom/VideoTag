package com.example.videotag.entities;

import java.io.File;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;

import jpaentitor.entities.AbstractEntity;

@Entity
public class Video extends AbstractEntity {
	private File file;
	private List<Sequence> sequenceList;
	private List<AbstractTag> tagList;
	
	public Video(File file, List<Sequence> sequenceList, List<AbstractTag> tagList) {
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
	
	public List<Sequence> getSequenceList() {
		return sequenceList;
	}
	
	private void setSequenceList(List<Sequence> sequenceList) {
		this.sequenceList = sequenceList;
	}
	
	public List<AbstractTag> getTagList() {
		return tagList;
	}

	private void setTagList(List<AbstractTag> tagList) {
		this.tagList = tagList;
	}
}