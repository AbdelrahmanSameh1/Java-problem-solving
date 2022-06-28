import java.util.Scanner;
public class triangle_area {

	public static void main(String[] args) {
		System.out.print("the area is ");
		getArea(10,15,20);
		
     }
	
	public static void getArea(double side1,double side2,double side3){
		
		side1=10;
		side2=15;
		side3=20;
		double area=0;
		double c = side1+side2+side3;
		double s = c/2;
		area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
		System.out.print(area);
		
		}

}
