package OOPS;

public class Vehical {
	private String color;
	protected int maxspeed;
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void print() {
		System.out.println("Vehical"+ " color "+color +"maxspeed" + maxspeed);
	}
}
