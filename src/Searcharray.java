package akshit1;

import java.io.IOException;
import java.util.Scanner;

public class Searcharray {
	public static void main(String[] args) throws IOException{

		int intArray[];    //declaring array
		intArray = new int[15];
		System.out.println("enter array");
		Scanner sc= new Scanner(System.in);
		int i;
		for(i=0;i<15;i++)
		{
			intArray[i]=sc.nextInt();
		}
		System.out.println("print element to be searched");
		int key;
		key=sc.nextInt();
		for(i=0;i<15;i++)
		{
			if(key==intArray[i])
			{
				System.out.println(" key Found at " +(i+1) +"th position");
				return;
			}
		}
		System.out.println(" key not found");

		
		}
}
