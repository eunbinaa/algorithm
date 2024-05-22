import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str= br.readLine().split(" ");
		int[] nums = new int[str.length];
		String answer="";
		for(int i=0; i<str.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[0]==1) {
				answer="ascending";
				if(nums[i]==i+1) {				
					continue;
				}else {
					answer="mixed";
					break;
				}
				
			}else if(nums[0]==8) {
				answer="descending";
				if(nums[i]==8-i) {
					continue;
				}else {
					answer="mixed";
					break;
				}
				
			}else {
				answer="mixed";
				break;
			}
		}
		
		System.out.println(answer);
	}
}