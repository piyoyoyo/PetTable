package com.techscore.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pet {
	@Id
	@Column(name="name")
	private String name;

	@Column(name="owner")
	private String owner;

	@Column(name="species")
	private String species;

	@Column(name="sex")
	private String sex;

	@Column(name="birth")
	private String birth;

	@Column(name="death")
	private String death;


	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public String getSpecies() {
		return species;
	}

	public String getSex() {
		return sex;
	}

	public String getBirth() {
		return birth;
	}

	public String getDeath() {
		return death;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setDeath(String death) {
		this.death = death;
	}
}
