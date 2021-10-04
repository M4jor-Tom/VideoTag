package com.example.videotag.entities;

import java.util.List;

import com.example.videotag.domain.VideoTagLabelizedDomainClass;

abstract public class AbstractTag extends VideoTagLabelizedDomainClass {
	private List<Sequence> sequenceList;

	public AbstractTag(String label, List<Sequence> sequenceList) {
		super(label);
		setSequenceList(sequenceList);
	}

	public List<Sequence> getSequenceList() {
		return sequenceList;
	}

	private void setSequenceList(List<Sequence> sequenceList) {
		this.sequenceList = sequenceList;
	}
}