package ust.examples;
enum Directions2{
	EAST ("E"),
	WEST ("W"),
	NORTH ("N"),
	SOUTH("S")
;
	private final String shortCode;
	Directions2(String code){
		this.shortCode= code;
		
	}
	public String getDirectionsCode() {
		return this.shortCode;
	}
}
public class Enum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directions2 dir = Directions2.SOUTH;
System.out.println(dir.getDirectionsCode());
Directions2 dir2 = Directions2.EAST;
System.out.println(dir2.getDirectionsCode());
	}

}
