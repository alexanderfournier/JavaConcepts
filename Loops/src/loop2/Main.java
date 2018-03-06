package loop2;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Input variables for loops!!
		 * 
		 * 
		 */
		 String s1="*";
		 int StaticMem = 9;
		 
		 		
	}
	
	
	/*
	 * These static methods are to demonstrate the concept of nested looping!
	 * 
	 */
	
private static void oneLoop()	{
	for(int a = 1; a<=10; a++) {
		System.out.print(a);
	}
}



private static void doubleLoop() {
	 for(int a = 1; a <= 5; a++) {
		 for(int b =1; b<a;b++) {
			 System.out.print(b);
		 }		 
	 }
}






 private static void staticIncrease() {
	 for(int a = 1; a <= 10; a++) {
		 for(int b =1; b<a;b++) {
			 System.out.print(b);
		 }
		 System.out.println();
		 
	 }
	
}
 
 
 
 
 
 
 
 
 
 private static void staticDecrease() {
	 for(int c = 10; c>=1; c--) {
		 for(int d = 1; d<c; d++) {
		 System.out.print(d);
	 }
		 System.out.println();
 }


}
 
 
 
 
 
 
 
 
 
 
 
 
/*
 * Desired output string pattern
 *  1&&&&&
 *  12&&&&
 *  123&&&
 *  1234&&
 *  12345&
 *  123456
 */
 
 
 
 private static void staticIncreaseDouble(String s1,int Staticmem) {
	 for(int aa =1; aa < Staticmem ; aa++) {
		 for(int bb = 1 ; bb<aa; bb++) {
			 System.out.print(bb);
		 }
		
	 for(int cc = Staticmem; cc> aa; cc--) {
		 System.out.print(s1);
	 }
	 System.out.println();
 }
}


 
 
 
 
 
 
 
 /*Desired output string pattern:
  *    12345&
  *    1234&&
  *    123&&&
  *    12&&&&
  *    1&&&&&
  *    &&&&&&
  */
 
 
 
 
 
 
private static void staticDecreaseDouble(String s1, int Staticmem) {
	for(int aa = Staticmem; aa>=1; aa--) {
		for(int bb = 1; aa>bb; bb++) {
		System.out.print(bb);
	}
	
		for(int cc = Staticmem; cc>=aa;cc--) {
			System.out.print(s1);
		}
		System.out.println();
	
	}
}







/*the string pattern looks like:
	@
	@@
	@ @
	@  @
	@   @
	@@@@@@*/





private static void gapForLoop(String s1,int Staticmem) {
	System.out.println();
	System.out.println(s1);
	for(int aa = Staticmem; aa>=1; aa--) {
		System.out.print(s1);
		for(int bb = Staticmem; bb>= aa; bb++) {
			System.out.print(bb);
		}
		System.out.println(s1);
	}
}
}

