package test;

public class client {
	//attributes
	public String name;
	public int age;
	public String adr;
	
	//Constructor
	public client(String name,int age , String adr)
	{
		this.name=name;
		this.age=age;
		this.adr=adr;
	}
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAdr() {
		return adr;
	}



	public void setAdr(String adr) {
		this.adr = adr;
	}


	
	
	
	@Override
	public String toString() {
		return "client [name=" + name + ", age=" + age + ", adr=" + adr + "]";
	}

}
