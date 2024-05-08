import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
	    String str= br.readLine();
	    String[]arr=str.split(" ");
	    for(int i=0; i<arr.length; i++) {
	    	sum+=Integer.parseInt(arr[i]);
	    }
		System.out.println(sum*5);
	}
}