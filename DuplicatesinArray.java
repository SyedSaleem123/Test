import java.util.Scanner;

public class DuplicatesinArray{
		
		static Scanner scan = new Scanner(System.in);
		
		//method to count the distinct elements in array
		
		public static int distinctEle(int [] arr) {
			
			for (int i=0;i<size ;i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i]==arr[j]&& i>j) {
						break;
						
					}
					if (arr[i]==arr[j]) {
						count++;
						break;
						
					}
					
				}
				
			}
			return count;
		}
		//method which removes the duplicates ele and returns new array
		
		public static int[] removeDuplicates(int[] arr,int[]arr1) {
			int index=0;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if (arr[i]==arr[j]&& i>j) 
						break;
					if (arr[i]==arr[j]) {
						arr1(index++)=arr[i];
						break;
					}
					}
					
				}
				
			}
		return arr1;
		}
		
		
		
		public static void main(String[] args) {
			int size;
			System.out.print("enter the array size");
			size=scan.nextint();
			int[] arr=new int[size];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("enter the array element "+(i+1));
				arr[i]=scan.nextint();
				
				
			}
			
		//creating a new array array to store the   distinct element 
		int arr1[]=new int[distinctEle(arr)];
		//calling the methods 
	    arr1=removeDuplicates(arr,arr1);
	    
	   // printing the distinct elements
	    System.out.println("the array which is created by removing duplicates in:"  );
	    
		System.out.println();
		System.out.print("[");
		for (int i : arr1) {
			System.out.print(i+",");
		}
		
		System.out.println("]");
	}

}