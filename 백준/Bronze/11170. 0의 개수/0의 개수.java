import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();	
		
		int num= Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int sum=0;
			for(int j=a; j<=b; j++) {
				String[]arr=String.valueOf(j).split("");
				for(int k=0; k<arr.length; k++) {
					if(arr[k].equals("0")) {
						sum++;
					}
				}
			}
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb.toString());
	}
	
	
}