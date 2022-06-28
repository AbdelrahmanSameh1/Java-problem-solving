import java.util.Scanner;
public class smallest_number {

	 public static void main(String[] args) {
		int smallestNum =0;
		 smallestNum = getSmallestNum(smallestNum);
		 System.out.print("the smallest number is " + smallestNum );
		 
		  }
	 public static int getSmallestNum(int smallestNum){
		 
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("please enter the first number");
		    int num1=scanner.nextInt();
		    System.out.println("please enter the second number");
		    int num2=scanner.nextInt();
		    System.out.println("please enter the third number");
		    int num3=scanner.nextInt();
		 if(num1<num2&&num1<num3){
			 smallestNum=num1;
		 }
		 else if(num2<num1&&num2<num3){
			 smallestNum=num2;
		 }
		 else{
			 smallestNum=num3;
		 }
		 
		 return smallestNum;
		 
	 }
		 

}
