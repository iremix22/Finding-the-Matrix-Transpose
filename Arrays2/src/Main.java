import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner scanner =new Scanner(System.in);
    	
    	System.out.println("enter the row");
    	int row=scanner.nextInt();
    	System.out.println("enter the column");
    	int column =scanner.nextInt();
    	
    	int [][] a=new int[row][column];
    	
    
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		a[i][j]=scanner.nextInt();
        	}
        }
        
        System.out.println("Matrix : ");
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[0].length; j++) { 
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + "  ");
            }
            System.out.println();
        }
	}

}
