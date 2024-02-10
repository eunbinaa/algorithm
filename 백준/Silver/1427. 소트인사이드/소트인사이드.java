
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int temp=0;
		int[] nums=new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			nums[i]=Integer.parseInt(str.substring(i,i+1));
			
		}
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]<nums[j]) {
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
			
		}
	
	  for(int i : nums)System.out.print(i);
	}

}
