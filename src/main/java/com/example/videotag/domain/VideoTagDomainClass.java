package com.example.videotag.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
public class VideoTagDomainClass {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private Date dateCreated;
    private Date lastUpdated;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    private void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

    public Date getLastUpdated() {
        return lastUpdated;
    }

	private void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

    //Insures that the date is updated at each UPDATE command on database
    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        setLastUpdated(new Date());
        if (getDateCreated() == null) {
            setDateCreated(new Date());
        }
    }
}