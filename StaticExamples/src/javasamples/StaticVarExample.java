package javasamples;

public class StaticVarExample {
	public static String Hello = "hello";


	public static void main(String args[]) {
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		
		System.out.println(obj.Hello);
		
		obj.Hello = "changed";
		
		System.out.println("yoyo");
		
	}
	

	
}
