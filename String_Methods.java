import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the String: ");
	    String s=sc.nextLine();
	    System.out.println("The Input String given is: "+s);
	    System.out.println("The length of the string is: "+s.length());
	    System.out.println("The UpperCase of the string is: "+s.toUpperCase());
	    System.out.println("The LowerCase of the string is: "+s.toLowerCase());
	    int l=s.length();
	    char ch[]=new char[l];
	    ch=s.toCharArray();
	    System.out.println("The String Converted to Character: ");
	    for(int i=0;i<l;i++)
	    {
	        System.out.print(ch[i]);
	    }
	    
	}
}
