package ust.examples;

 enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH
}
public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Directions dir = Directions.NORTH;
if(dir == Directions.EAST) {
	System.out.println("Direction:East");
}
else if(dir == Directions.WEST) {
	System.out.println("Direction:West");
}else if(dir == Directions.NORTH) {
	System.out.println("Direction:North");
	}else {
		System.out.println("Direction:South");
	}

}
}