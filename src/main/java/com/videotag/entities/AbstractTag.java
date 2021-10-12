package com.videotag.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import jpaentitor.entities.AbstractLabelizedEntity;

@Entity
abstract public class AbstractTag extends AbstractLabelizedEntity {
	@ManyToMany
	private List<Compilation> sequenceList;

	public AbstractTag(String label, List<Compilation> sequenceList) {
		super(label);
		setSequenceList(sequenceList);
	}

	public List<Compilation> getSequenceList() {
		return sequenceList;
	}

	private void setSequenceList(List<Compilation> sequenceList) {
		this.sequenceList = sequenceList;
	}
}