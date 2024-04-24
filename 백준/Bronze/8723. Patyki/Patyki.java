import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[]arr=a.split(" ");
		int[]nums=new int[3];
		for(int i=0; i<arr.length; i++) {
			nums[i]=Integer.parseInt(arr[i]);
		}
        Arrays.sort(nums);
		if(nums[0]==nums[1]&&nums[1]==nums[2]&&nums[0]==nums[2]) {
			System.out.println(2);
		}else if(nums[0]*nums[0]+nums[1]*nums[1]==nums[2]*nums[2]) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}