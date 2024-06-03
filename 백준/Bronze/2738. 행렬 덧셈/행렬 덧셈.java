import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String[]str=br.readLine().split(" ");
		int[] nums=new int[str.length];
		for(int i=0; i<nums.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		int[][]a=new int[nums[0]][nums[1]];
		int[][]b=new int[nums[0]][nums[1]];
		int k=0;
		for(int i=0; i<2*nums[0]; i++) {
			String[]array=br.readLine().split(" ");
			for(int j=0; j<array.length; j++) {
				if(i>=nums[0]) {
					
					b[i-nums[0]][j]=Integer.parseInt(array[j]);
					
				}else {
					a[i][j]=Integer.parseInt(array[j]);
				}
				
			}
			k++;
			
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sb.append(a[i][j]+b[i][j]+" ");
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	
		
	}
}