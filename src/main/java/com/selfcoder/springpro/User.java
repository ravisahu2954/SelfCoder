package com.selfcoder.springpro;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

    public int id;
	
	@Column(name = "email", nullable = false, length = 100)
	public String email;
	
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     


	@Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

	public User(String email,int id,String firstName, String lastName) {
		super();
		this.email=email;
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	
		// TODO Auto-generated constructor stub
	}
    public int getid() {
		return id;
	}

	public void setid(int id) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
	
     
    
}