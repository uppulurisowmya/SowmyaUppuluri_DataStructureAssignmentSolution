package dsGradedAssignmentSolution;

import java.util.Scanner;

public class BuildingArch_Assignment {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building : ");
		int noOfFloors = sc.nextInt();
		int x[] = new int[noOfFloors+1];
		for(int i=1;i<noOfFloors+1;i++){
			System.out.println("Enter the floor size given on day : "+i);
			int floorSize=sc.nextInt();
			x[floorSize]=i;
		}
		int j=noOfFloors;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		for(int i=1;i<=noOfFloors;i++){
			flag=false;
			System.out.println("Day "+i+" :");
			while(j>=1 && x[j]<=i){
				flag=true;
				System.out.print(j +" ");
				j--;
			}
			if(flag==true){
				System.out.println();
			}
		}
	}
}
