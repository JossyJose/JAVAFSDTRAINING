package ust.examples;
/*
 * 
 * 
 * 
 */
public class Example22 {
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	
	Example22(String x, String y, String z,String a,String b,float c){
		
		fName = x;
		lName = y ;
		city = z;
		address=a;
		dob = b;
		salary=c;
		
	}
	
	void Display()
	{
		System.out.println(fName+ " "+lName+" " +city+" " + address+ " "+ dob+ " "+ salary) ;   
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example22 e1= new Example22("abhinaya","vishakhan"," palakkad ",  "xyz", "12-12-1998",2600.0f);
		Example22 e2= new Example22("rish","n"," palakkad ",  "cfr", "12-12-1998",2600.0f);
		Example22 e3= new Example22("aish","swamy"," palakkad ",  "nhy", "6-12-1998",2600.0f);
		Example22 e4= new Example22("niy","rahman"," palakkad ",  "hyu", "4-12-1998",2600.0f);
		Example22 e5= new Example22("ranee","gang"," palakkad ",  "mko", "5-12-1998",2600.0f);
		
		Example22 array[]= new Example22[5];
		array[0]=new Example22("abhinaya","vishakhan"," palakkad ",  "xyz", "12-12-1998",2600.0f);
		array[1]= new Example22("rish","n"," palakkad ",  "cfr", "12-12-1998",2600.0f);
		array[2]=new Example22("aish","swamy"," palakkad ",  "nhy", "6-12-1998",2600.0f);
		array[3]=new Example22("niy","rahman"," palakkad ",  "hyu", "4-12-1998",2600.0f);
		array[4]=new Example22("ranee","gang"," palakkad ",  "mko", "5-12-1998",2600.0f);
		
		
		for(int i = 0;i<array.length;i++) {
			array[i].Display();
		}
		
		/*for(Example22 e:array ) {
			//System.out.println(e.fName+ e.lName+ e.city+ e.address+e.dob+e.salary);
		e.Display();
		}
		*/
		
	//	e1.Display()
	//	e2.Display();
	//	e3.Display();
	//	e4.Display();
	//	e5.Display();
		
		
		
		
	}

}
