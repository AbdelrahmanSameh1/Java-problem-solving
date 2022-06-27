package password;
import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("please enter the password");
		String password = scanner.nextLine();
		if(validOrNot(password))
			System.out.println("valid password");
		else
			System.out.println("invalid password");
			
		}
	
	public static boolean validOrNot(String password){
	    int x=0;
		int y=0;
		int z=0;
		char c;
		if(password.length()<10)
			return false;
		
		for(int i=0; i<password.length(); i++){
				c = password.charAt(i);
				if(Character.isLetter(c))
					x++;
				else if(Character.isDigit(c))
					y++;
				else    
					z++;    /* if the character not letter neither digit it will be
                                a special character and its counter is z  */				
			}
		
		if(x>0&&y>0&&z>0)
			return true;
			

		return false;
		
		}

}
