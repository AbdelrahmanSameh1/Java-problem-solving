import java.util.Scanner;

public class Matrix_multiplication {

	public static void main(String[] args) {
		
		System.out.println("Please Insert the first Matrix row count");
		Scanner scanner = new Scanner (System.in);
		int rowCount1 = scanner.nextInt();
	    System.out.println("Please Insert the first Matrix columns count");
         
	    int columnCount1 = scanner.nextInt();
		
	    int matrix1[][] = new int [rowCount1] [columnCount1];
		
		 for (int i = 0; i < rowCount1; i++) {
		    for(int j = 0; j < columnCount1; j++) {
		         System.out.println("enter number at row "
		           + (i+1) + " and column " + (j+1) );
		            matrix1[i][j] = scanner.nextInt();
	         }
		 }
		 
		 
		 System.out.println("Please Insert the second Matrix row count");
		 int rowCount2 = scanner.nextInt();
		 System.out.println("Please Insert the second Matrix columns count");
		 int columnCount2 = scanner.nextInt();
		 int matrix2[][] = new int [rowCount2] [columnCount2];
		 
		 for(int i=0;i<rowCount2;i++){
			 for(int j=0;j<columnCount2;j++){
				 System.out.println("enter number at row " + (i+1)+ " and column " + (j+1));
				 matrix2[i][j] = scanner.nextInt();
			 }
			 
		 }
		 
		 
		 
		System .out.println("the first matrix is ");
		 for (int i = 0; i < rowCount1; i++) {
		     for(int j = 0; j < columnCount1; j++) {
		         System.out.print(matrix1[i][j] + " ");
		    }
		 System.out.println();
    	}
		 
		 System.out.println("the second matrix is");
		 for(int i=0;i<rowCount2;i++){
			 for(int j=0;j<columnCount2;j++){
				 System.out.print(matrix2[i][j] + " ");
			 }
			 System.out.println();	 
		 }
		 
		 
		 if(columnCount1 == rowCount2){
			 
			 int result[][] = new int [rowCount1] [columnCount2];
			 int sum=0;
			 
			 
			   for(int i=0;i<rowCount1;i++){ 
			       for( int j=0;j<columnCount2;j++){ 
			          for(int k=0;k<rowCount2;k++){
				         sum=sum+matrix1[i][k]*matrix2[k][j];
			              }
				         result[i][j]=sum;
				         sum=0;
			             
			           
			         }
				   }
			 
			   System.out.println("Multiplication result is");
			   
			   for(int i=0;i<rowCount1;i++){
				   for(int j=0;j<columnCount2;j++){
					   System.out.print(result[i][j] + " ");
				   }
				   System.out.println();
			   }
			 
		 }
		 else{
			 System.out.print("there is no multiplication result (invalid)");
			 
		     }
		 
	}
}
