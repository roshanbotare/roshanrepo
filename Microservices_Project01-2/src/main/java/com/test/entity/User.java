
package com.test.entity;

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
@Table(name = "USER_TABLE1")
public class User  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	
	@Column(length = 20)
	@NonNull
	private String userName;

	@Column(length = 20)
	@NonNull
	private String email;
	
	@Column(length = 20)
	@NonNull
	private String password;
	
	@Column(length = 20)
	@NonNull
	private String phone;
	
	@Column(length = 20)
	@NonNull
	private String address;
	
	
}
