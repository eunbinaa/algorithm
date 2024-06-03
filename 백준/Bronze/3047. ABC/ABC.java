import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int temp=0;
		String[]str=br.readLine().split(" ");
		int nums[]=new int[str.length];
		String abc=br.readLine();
		for(int i=0; i<str.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			if(abc.charAt(i)=='A') {
				sb.append(nums[0]+" ");
			}else if(abc.charAt(i)=='B') {
				sb.append(nums[1]+" ");
			}else {
				sb.append(nums[2]+" ");
			}
		}
		System.out.println(sb.toString());
	}
}