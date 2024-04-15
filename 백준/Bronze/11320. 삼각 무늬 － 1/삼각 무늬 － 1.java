import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
	
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String str=br.readLine();
			String[]arr=str.split(" ");
		int sum=(Integer.parseInt(arr[0])*Integer.parseInt(arr[0]))/(Integer.parseInt(arr[1])*Integer.parseInt(arr[1]));
		sb.append(sum);
		sb.append('\n');
		}
	    System.out.println(sb.toString());
	}
}