package akshit1;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


public class Armstrong {
	public static void main(String[] args) throws IOException{

		int a;
		Scanner scan=new Scanner(System.in);
	    a=scan.nextInt();
	    int b=a,dig,arm=0;
	    while(b>0) {
	    	dig=(int) Math.pow((b%10),3);
	    	b/=10;
	    	arm=arm+dig;
	    	
	    	
	    	
	    }
	    if(arm==a)
	    	System.out.println("Armstrong");
	    else System.out.println("Not Armstrong");
	    
	   
	    //System.out.println(b);
	    scan.close();
	    
}
}
