package container;
import java.util.Scanner;

public class maxNumber {

	public static void main(String[] args) {
		
	
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of lines");
        int n = s.nextInt();
    	int [] arr = new int[n];
    			
        System.out.println("enter the length of vertical lines");
        for(int i = 0; i<n; i++)
        {
        	arr[i] = s.nextInt();
        }      
        
        System.out.println("Maximum area is: " + maxArea(arr, n));


	}
	
	public static int maxArea(int [] arr, int n)
	{
		int max = 0;
		
		for(int i = 0; i<n; i++)
		{
			
			for(int j = i+1; j<n; j++)
			{
				
				if(arr[i] <= arr[j])
				
					max = maxNumber(max, arr[i] * (j-i));
				
				else
					
					max = maxNumber(max, arr[j] * (j-i));		
			}			
		}
		return max;
		
	}
	
	public static int maxNumber(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
			
	}

}
