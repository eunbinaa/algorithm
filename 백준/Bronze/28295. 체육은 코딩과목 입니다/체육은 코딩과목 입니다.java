import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int[] nums=new int[10];
		String[]w= {"E","S","W","N"};
		int sum=0;
		for(int i=0; i<10; i++) {
			nums[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			if(sum>=4) {
				sum-=4;
			}
		}
		if(sum%4==0) {
			System.out.println(w[3]);
		}else {
			System.out.println(w[sum-1]);
		}
		
	}
}