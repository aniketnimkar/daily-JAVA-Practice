package day2;

public class Program5_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Downcasting or Explicit type conversion
		
		float height = 162.5f;
		int heightInt = (int)height;
		System.out.println(heightInt);
		
		
		//Upcasting = IMPLICIT TYPE conversion
		int age=32;
		float ageFloat = age;
		System.out.println(ageFloat);
	}

}
