package com.epiuse.recruiting.entity;


import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Module
 */
@Entity
@Table(name = "module")
public class Module implements Serializable {

    private static final long serialVersionUID = 1L;
	
	@Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 128, name = "modulecode")
    private String moduleCode;

    @Column(length = 128, name = "moduledescription")
    private String moduleDescription;

    @Column(name = "markreceived")
    private float markReceived;

    @Column(name = "isdistinction")
    private boolean isDistinction;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "snumber")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    public float getMarkReceived() {
        return markReceived;
    }

    public void setMarkReceived(float markReceived) {
        this.markReceived = markReceived;
    }

    public boolean isIsDistinction() {
        return isDistinction;
    }

    public void setIsDistinction(boolean distinction) {
        isDistinction = distinction;
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
