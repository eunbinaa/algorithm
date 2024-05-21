import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str= br.readLine().split(" ");
		int[] nums = new int[str.length];
		for(int i=0; i<str.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		int sum=0;
		for(int i=1; i<=nums[0]; i+=nums[1]) {
			if(i!=1) {
				sum+=nums[2];
			}
		}
		
		System.out.println(sum*nums[3]);
	}
}