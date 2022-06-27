import java.util.Scanner;
import java.util.Arrays;


public class insertionSort {

	public static void main(String[] args) {
		
		int x, y; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of elements");
		x = scanner.nextInt();
		int [] arr = new int[x];
		
		System.out.println("enter the elements of the array");
		
		for(int i = 0 ; i<x; i++)
		{
			y = scanner.nextInt();
			arr[i] = y;
			
		}
		
		int [] sortedArray = sorting(arr);
		
		
		System.out.print("sorted array is : ");
		for(int i = 0 ; i<sortedArray.length; i++)
		{
			
			System.out.print( " " + sortedArray[i]);
			
		}
	
	}
	
	
	public static int[] sorting(int arr[]) {
		
		for(int i = 1 ; i<arr.length; i++)
		{
			
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
		
		return arr;
		
	}
 	
	
}
