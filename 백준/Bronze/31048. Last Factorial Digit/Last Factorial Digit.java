import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
		 int a=Integer.parseInt(br.readLine());
		 int sum=1;
		 for(int j=1; j<=a; j++) {
			 sum*=j;
			 
		 }
		 if(sum>=10) {
			 String str=String.valueOf(sum);
			 sb.append(str.substring(str.length()-1)).append('\n');
		 }else {
			 sb.append(sum).append('\n');
		 }
		}
		
		
		System.out.println(sb.toString());
	}
}