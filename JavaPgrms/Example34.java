package ust.examples;

class Cpu{
	double price;
	//nested class
	class Processor{
		
		//members of nested clASS
		double cores;
		String manufacturrer;
		double getCache() {
			return 4.3;
		}
	}
	//nested protected class
	protected class RAM{
		//members of protected nested class 
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
		}
		
	}
}


public class Example34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create object of outer class CPU
		Cpu cpu = new Cpu();
		
		// create an object of inner  lass processor
		Cpu.Processor processor = cpu.new Processor();
		//create an object of inner class RAM using outer class Cpu
		Cpu.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = "+ processor.getCache());
		System.out.println("Ram clock speed = "+ ram.getClockSpeed());
		
		
		
		
		
		
	}

}
