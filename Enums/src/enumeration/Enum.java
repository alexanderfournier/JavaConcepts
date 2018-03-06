package enumeration;

public enum Enum {
	alex("sexgod","24"),
	helen("cutie","22"),
	brad("a chad", "25"),
	alexander("cooler","27");
	
	
	private final String desc;
	private final String age;
	
	Enum(String description, String birth ){
		desc = description;
		age = birth;
		
	}
	
	public String getDesc() {
		return desc;
	}

	public String getAge(){
		return age;
	}
	
	
}

