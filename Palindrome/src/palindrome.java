import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s =in.nextLine();
	

	String x ="";
	for(int i=s.length()-1;i>=0;i--)
	   x=x+s.charAt(i); 
	   
	    
	    if (s.equals(x))
	    System.out.println("palindrome");
	    else System.out.println("not palindrome");
	    
	}
}