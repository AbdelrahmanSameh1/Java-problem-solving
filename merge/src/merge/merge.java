package merge;


public class merge {
	
	
	public static void main(String[] args) {
		
		int [] arr1 = {-1000, -10, 61, 69, 77, 79}; 
		int [] arr2 = {-8, 0, 20, 39, 81};
		int [] result = mergeing(arr1, arr2);
		
		
		System.out.print("arr1 : ");
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.print(" " + arr1[i]);
		}
		System.out.println();
		
		
		
		System.out.print("arr2 : ");
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.print(" " + arr2[i]);
		}
		System.out.println();
		
		
		System.out.print("result : ");
		for(int i = 0; i<arr1.length+arr2.length; i++)
		{
			System.out.print(" " + result[i]);
		}
		System.out.println();
		
		
		
		
	}
	
	public static  int [] mergeing(int arr1[], int arr2[]) {
		
		int [] result = new int[arr1.length + arr2.length];
		
		int x, y, z;
		x = y = z = 0;
		
		while(x < arr1.length && y < arr2.length)
		{
			if(arr1[x] < arr2[y]) {
				
				result[z] = arr1[x];
				x++;
				z++;
					
			}
			else
			{
				result[z] = arr2[y];
				y++;
				z++;
				
			}
			
		}
		
		while(x < arr1.length)
		{
			result[z] = arr1[x];
			x++;
			z++;
		}
		
		while(y < arr2.length)
		{
			result[z] = arr2[y];
			y++;
			z++;
		}
		
		
		return result;
					
	}

		
}