package com.example.videotag.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;

import jpaentitor.entities.AbstractLabelizedEntity;

@Entity
abstract public class AbstractTag extends AbstractLabelizedEntity {
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