package user_module;

import history_module.History;

public class User implements Comparable<User> {
	private String username;
	private String password;
	private String proPicAddress; 
	private History history;
	private String id;
	private UserType type;

	private static int idCounter = 0;

	public User(String username, String password, UserType type) {
		this.username = username;
		this.password = password;
		this.type = type;
		history = new History();
		id = String.valueOf(idCounter++);
	}
	
	public User(String username, String password, UserType type, History history) {
		this.username = username;
		this.password = password;
		this.history = history;
		this.type = type;
		id = String.valueOf(idCounter++);
	}
	
	public User(String username, String password) { //dummy constructor for comparing
		this.username = username;	
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
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

	public String getProPicAddress() {
		return proPicAddress;
	}

	public void setProPicAddress(String proPicAddress) {
		this.proPicAddress = proPicAddress;
	}
	
	public History getHistory() {
		return history;
	}
	
	public void setHistory(History history) {
		this.history = history;
	}

	public String getId() {
		return id;
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
		return "USER:" + username+" PASS:"+password;
	}
	
	

}
