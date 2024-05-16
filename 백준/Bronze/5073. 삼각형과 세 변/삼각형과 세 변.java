import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
	   while(true) {
		   String str=br.readLine();
		   String[] arr=str.split(" ");
		   if(str.equals("0 0 0")) {
			   break;
		   }else {
			   int nums[]=new int[3];
			   for(int i=0; i<3; i++) {
				   nums[i]=Integer.parseInt(arr[i]);
			   }
			   Arrays.sort(nums);
			   if(nums[0]+nums[1]<=nums[2]) {
				   sb.append("Invalid").append('\n');
			  }else{
				  if(nums[0]==nums[1]&&nums[1]==nums[2]&&nums[0]==nums[2]) {
					  sb.append("Equilateral").append('\n');
				  }else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]) {
					  sb.append("Isosceles").append('\n');
				  }else {
					  sb.append("Scalene").append('\n');
				  }
			  }
		   }
	   }
	  
	    System.out.println(sb.toString());
	
	}
}