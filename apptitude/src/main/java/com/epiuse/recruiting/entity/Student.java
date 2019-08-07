package com.epiuse.recruiting.entity;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Entity implementation class for Entity: Student
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable = false, name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(length = 128, name = "firstname")
    private String firstName;

    @Column(length = 128, name = "lastname")
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate")
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "entrydate")
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date entryDate;

    @Column(length = 4, name = "year")
    private int year;

    @Column(length = 128, name = "degree")
    private String degree;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<Module> modules;

    public Student(){
        super();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}
}

