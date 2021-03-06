package springwork.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import springwork.customAnnotations.EmailConstraint;

public class User {
	@NotNull
	@Size(min = 5, max=Integer.MAX_VALUE,
	message = "User name must be between {2} and {1}")
	private String username;
	private String password;
	@EmailConstraint
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassowrd(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
}
