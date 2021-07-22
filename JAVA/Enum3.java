package ust.examples;
 enum Directions1{
	EAST,
	WEST,
	NORTH,
	SOUTH
}
public class Enum3 {
	Directions1 dir;
	public  Enum3(Directions1 dir)
	{
		this.dir =  dir;
	}
	public void getMyDirections1() {
		switch(dir) {
		case EAST:
			System.out.println("Direction:East");
			break;
				
		case WEST:
			System.out.println("Direction:West");
			break;
			
		case NORTH:
			System.out.println("Direction:North");
			break;
			
			default:
				System.out.println("Direction:South");
				break;
	

	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Enum3 obj1 = new Enum3(Directions1.EAST);
	obj1.getMyDirections1();
	Enum3 obj2 = new Enum3(Directions1.EAST);
	obj2.getMyDirections1();
	}

}
