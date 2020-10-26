package user_model;


public class User implements Comparable<User> {
	private String username;
	private String password;
	private String proPic; // not implemented
	//private History history
	private String id;

	private static int idCounter = 0;

	public User(String username) {
		this.username = username;
		id = String.valueOf(idCounter++);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProPic() {
		return proPic;
	}

	public void setProPic(String proPic) {
		this.proPic = proPic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int compareTo(User u) {
		if (username.compareTo(u.username) == 0) {
			return 0;
		} else if (username.compareTo(u.username)>0) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Username: " + username;
	}
	
	

}
