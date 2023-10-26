import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nums[]=new int[3];
		for(int i=0; i<3; i++) {
			nums[i]=sc.nextInt();
			}
		
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[j];
					
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}
		  for(int k : nums) {
			  System.out.print(k+" ");  
		  }

    }
	
	}