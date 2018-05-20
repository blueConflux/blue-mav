package blue.io.events;

public class Eventr {

	private final String id;
	
	private final String description;
	
	public Eventr(String id,String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
}
