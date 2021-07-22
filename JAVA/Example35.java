package ust.examples;

class Car{
	String carName;
	String carType;
	//assign value using constructor
	public Car(String name, String type) {
		this.carName= name;
		this.carType= type;
	}
	
	
private String getcarName() {
	return this.carName;
}

class Engine{
	String engineType;
	void setEngineType() {
		
		if(Car.this.carType.equals("4WD")) {
			if(Car.this.getcarName().equals("Crysler")) {
				this.engineType="smaller";
			}else {
				this.engineType="bigger";
			}
		}
		}
		String getEngineTYpe() {
			return this.engineType;
		}
	}
}

public class Example35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Mazda","8WD");
		//create an object of inner class using the outer class
		Car.Engine engine = c1.new Engine();
		engine.setEngineType();
		System.out.println("Engine type of 8WD = "+ engine.getEngineTYpe());
		
		Car c2= new Car ("Crysler","4WD");
		Car.Engine c2engine = c2.new Engine();
		c2engine.setEngineType();
		System.out.println("Engine type of 4WD = "+ c2engine.getEngineTYpe());
		
		
	}

}
