package es.sidelab.ejemplorest1client2;

public class Player {

	private String name;
	private String nickname;

	public Player() {
	}
	
	public Player(String name, String nickname) {
		this.name = name;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "[Name: "+name+", Nickname: "+nickname+"]";
	}
}
