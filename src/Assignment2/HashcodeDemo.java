package Assignment2;

public class HashcodeDemo {
	/*I've wrote a program in java to create a class and initialize two objects of that class the print

the hash code of both.*/

	public static void main(String[] args) {
		

		HashcodeDemo hs= new HashcodeDemo(); // object one
		HashcodeDemo hs1= new HashcodeDemo(); // object two
				
				System.out.println(hs.hashCode());// console window
				System.out.println(hs1.hashCode()); // console window
	}

}
