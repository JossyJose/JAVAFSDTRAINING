package ust.examples;

public class Config {
 final static String Name= "CONFIG";
 final long initTime;
 Config(){
	 this.initTime=System.currentTimeMillis();
 }
 
			 
 
 
 
	public static void main(String[] args) {
		
	Config cfg1= new Config();
	System.out.println(cfg1.initTime);
		
		
	Config cfg2= new Config();
	System.out.println(cfg2.initTime);
		
		
		
		
		
		
	}

}
