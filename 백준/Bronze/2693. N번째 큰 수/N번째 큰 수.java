import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num= Integer.parseInt(br.readLine());
		int[] nums=new int[10];
		int sum=0;
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			for(int j=0; j<10; j++) {
				nums[j]=Integer.parseInt(str[j]);
				
			}
			Arrays.sort(nums);
			sb.append(nums[7]).append('\n');
		}
		System.out.println(sb.toString());
	}
}