package akshit1;
import java.util.*;
import java.io.*;
import java.text.DateFormatSymbols;


public class Marksaverage{
	public static void main(String[]  args) throws IOException{
		float[][] marks=new float[3][3];
		Scanner sc= new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++)
		{
			System.out.println("enter marks of student " +(i+1));
			for(j=0;j<3;j++)
			{
				marks[i][j]=sc.nextFloat();
			}
		}
		for(i=0;i<3;i++) {
		System.out.println("total scored in subject " +(i+1) +" is " +(marks[0][i]+marks[1][i]+marks[2][i]));
		System.out.println("average in subject " +(i+1) +" is " +((marks[0][i]+marks[1][i]+marks[2][i])/3));
		}
		for(i=0;i<3;i++) {
		System.out.println("total scored by student " +(i+1) +" is " +(marks[i][0]+marks[i][1]+marks[i][2]));
		System.out.println("average in subject " +(i+1) +" is " +((marks[i][0]+marks[i][1]+marks[i][2])/3));
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String abc=br.readLine();
		String[] date=abc.split(",");
		int x=Integer.parseInt(date[1]);
		//System.out.println(date[1]);
		String monthString;
		monthString = new DateFormatSymbols().getMonths()[x-1];
       System.out.println(date[0] +"/" +monthString +"/" +date[2]);
		//int a=date.length;
        sc.close();
}
}