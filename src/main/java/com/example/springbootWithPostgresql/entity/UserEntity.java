package com.example.springbootWithPostgresql.entity;

import javax.persistence.*;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "users", schema = "public")
public class UserEntity {

    @Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", password=" + password + ", city=" + city + "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="pk_my_user_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String city;

    public UserEntity(Long id, String name, String password, String city) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.city = city;
    }

    public UserEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
