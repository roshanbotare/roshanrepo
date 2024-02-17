package com.roshan.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="STUDENT_TABLE")
public class Student implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;


@Column(length = 20)
@NonNull
private String name;

@Column(length = 20)
@NonNull
private String location;

@Column(length = 20)
@NonNull
private String course;

	
	
	
}
