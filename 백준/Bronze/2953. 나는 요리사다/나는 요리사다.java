import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int nums[]=new int[5];
		int sum=0;
		int temp=0;
		int answer=0;
		for(int i=0; i<5; i++) {		
			String[] str=br.readLine().split(" ");
			for(int j=0; j<4; j++) {
				sum+=Integer.parseInt(str[j]);
			}
			nums[i]=sum;
			sum=0;
		}
	
		for(int i=0; i<nums.length; i++) {
			if(answer<nums[i]) {
				answer=nums[i];
				temp=i;
			}
			
		}
		System.out.println(temp+1 +" "+answer);
	}
}