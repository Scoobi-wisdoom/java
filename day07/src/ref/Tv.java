package ref;

public class Tv {
	String name;
	public Tv() {}
	public Tv(String name) {
		this.name = name;
	}
	
	public void powerOn() {
		System.out.println(name+" Power on ...");
	}
	
	public void powerOff() {
		System.out.println(name+" Power off ...");
	}
	
	@Override
	public String toString() {
		return "Tv [name=" + name + "]";
	}

}
