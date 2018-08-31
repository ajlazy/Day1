package akshit1;
import java.util.*;
import java.io.*;
import java.text.DateFormatSymbols;


public class Password {
	public static void main(String[]  args) throws IOException{
      Scanner sc= new Scanner(System.in);
       String u="ajlazy";
    	String p="akshit123";	   
      int count=0;
      while(count<3)
      {
    	  System.out.println("enter username");
          String username=sc.nextLine();
          System.out.println("enter password");
          String pw=sc.nextLine();
          if(u.equals(username)&&p.equals(pw)) {
        	  System.out.println("Welcome");
        	  return;
        	  }
        	  else{
        		  count++;
        		  if(count!=3) System.out.println("Wrong username or password. Enter again");
        		  
        	  };  
      }
          if(count==3)
        	  System.out.println("Contact Admin");
      


	}}
		