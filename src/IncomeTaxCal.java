package akshit1;

import java.util.Scanner;

public class IncomeTaxCal {
	public static void main(String[]  args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter CTC");
		float ctc=scan.nextFloat();
		if(ctc>0&&ctc<180000)
			System.out.println("0");
		if(ctc<=300000&&ctc>180000)
			System.out.println("tax is "+(0.1*ctc));
			if(ctc>300000&&ctc<=500000)
				System.out.println("Tax is "+(0.2*ctc));
				if((ctc<=1000000)&&(ctc>500000))
					System.out.println("Tax is "+(0.3*ctc));


	   
	    scan.close();
		
	}
	}


