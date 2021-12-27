package in.ashokit.enity;

import lombok.Data;

@Data
public class User {
	public User(int userid, String username, String useremail) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
	}
	private int userid;
	private String username;
	private String useremail;
	
}
