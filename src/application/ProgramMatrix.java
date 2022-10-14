package application;

import java.util.Scanner;

public class ProgramMatrix {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter m x n: ");
		int m1 = sc.nextInt();
		int n1= sc.nextInt();
		int[][] mat = new int[m1][n1];
		System.out.println("Enter matrix data: ");
		for(int m=0;m<mat.length;m++) {
			for(int n=0;n<mat[m].length;n++) {
				mat[m][n] = sc.nextInt();
			}
		}
		System.out.println("Enter with number: ");
		int number= sc.nextInt();

		System.out.println("Result: ");
		System.out.println("============================================================");

		for(int m=0;m<mat.length;m++) {
			for(int n=0;n<mat[m].length;n++) {
				if (mat[m][n] == number) {
					System.out.println("Position: "+ m+","+n+":");
					if(n>0) {
						System.out.println("Left: " + mat[m][n-1]);
					}
					if(m>0) {
						System.out.println("UP: "+mat[m-1][n]);
					}
					if(n<mat[m].length-1) {
						System.out.println("Rigth: "+ mat[m][n+1]);
					}
					if(m<mat.length-1) {
						System.out.println("Down: "+mat[m+1][n]);
					}
					System.out.println("---------------------------------");
				}
		
			}

  }
		sc.close();
 }
}

