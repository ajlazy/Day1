
package akshit1;
import java.util.*;
import java.math.*;
public class SiAndCi {
public static void main(String[]  args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter principal");
    float pri=scan.nextFloat();
    System.out.println("Enter intrest");
    float intr=scan.nextFloat();
    System.out.println("Enter time");
    float time=scan.nextFloat();
    float si=(int) ((pri*intr*time)/100);
    float ci= (float) (pri*(Math.pow((1+(intr/100)),time)))-pri;
    System.out.println("Si is " +si);
    System.out.println("ci is " +ci);
    int rev = 0,rem=0;
    
   
    scan.close();
	
}
}