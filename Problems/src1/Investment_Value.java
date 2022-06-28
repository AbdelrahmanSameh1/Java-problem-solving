import java.util.Scanner;
public class Investment_Value {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter the investment amount ");
		int amount = scanner.nextInt();
		System.out.print("please enter the rate of interest ");
		int rate = scanner.nextInt();
		System.out.print("please enter the number of years ");
		int yearsNum = scanner.nextInt();
		System.out.println();
		System.out.println("years   investment value ");
		
		interestValue(amount, rate, yearsNum);

	}
	
	
	
	public static void interestValue(double amount, double rate, double yearsNum){
		
		for(int i=1; i<=yearsNum; i++){
			
			System.out.println(i + "       " +amount*Math.pow(1+rate/100 , i) );
			
		}
		
	}

}






