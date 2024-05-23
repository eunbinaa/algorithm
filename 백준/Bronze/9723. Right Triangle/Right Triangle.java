import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		for(int j=0; j<N; j++) {
		String[] str= br.readLine().split(" ");
		int[] nums = new int[str.length];
		for(int i=0; i<str.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(nums);
		
			if(nums[0]*nums[0]+nums[1]*nums[1]==nums[2]*nums[2]) {
				sb.append("Case #"+(j+1)+": YES").append('\n');
			}else {
				sb.append("Case #"+(j+1)+": NO").append('\n');
			}
		}
		
		System.out.println(sb.toString());
	}
}