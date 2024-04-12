import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());	
		long[] nums= new long[num+1];
		nums[0]=0;
		nums[1]=1;
	    for(int i=2; i<num+1; i++) {
	    	nums[i]=nums[i-1]+nums[i-2];
	    
	    }
	    System.out.println(nums[nums.length-1]);
	}
}