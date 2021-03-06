package tv;

public class Tv {
	// 속성 attributes
	String color;
	boolean power;
	int channel;
	
	// 생성자 constructor
	public Tv() {
		this.color = "black";
		this.power = false;
		this.channel = 10;
	}
	public Tv(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	// 기능 behaviors, operations, functions, methods
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	public void channelUp() {
		channel += 1;
	}
	public void channelDown() {
		channel -= 1;
	}
	@Override
	public String toString() {
		return "Tv [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
	
}
