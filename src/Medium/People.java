package Medium;

public class People {
	private String name;
	private People other;
	
	public People(String name) {
		this.name= name;
	}

	public String getName() {
		return name;
	}

	public void connect(People other) {
		this.other = other;
	}
	
	public void talk(String msg) {
		other.listen(msg);
	}
	
	public void listen(String msg) {
		System.out.println(other.getName()+" ¶Ô"+this.name+"Ëµ:"+msg);
	}
	
	
}
