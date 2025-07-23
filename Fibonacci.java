package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int d=0;
		for(int i=1;i<=10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
//			//System.out.println(i);
//			//System.out.println(b);
		}
		
//		
//		  while(d<34) {
//		  
//		  d=a+b; a=b; b=d;
//		  
//		  System.out.println(d);
//		  
//		  }
//		 
		

	}

}
