
package akshit1;
import java.util.*;
import java.math.*;
public class Marks {
public static void main(String[]  args){
	int count =0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter marks of subject 1");
    int subj1=scan.nextInt();
    if(subj1>60)
    	count++;
    System.out.println("Enter marks of subject 2");
    float subj2=scan.nextInt();
    if(subj2>60)
    	count++;
    System.out.println("Enter marks of subject 3");
    int subj3=scan.nextInt();
    if(subj3>60)
    	count++;
    if(count==3)
        System.out.println("Passed");
    if(count==2)
        System.out.println("Promoted");
    if(count<=1)
        System.out.println("failed");
    

    	
    int rev = 0,rem=0;
    
   
    scan.close();
	
}
}