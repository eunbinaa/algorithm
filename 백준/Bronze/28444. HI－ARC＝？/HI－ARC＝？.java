import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int[] num=new int[5];
		String str=br.readLine();
		String[]a=str.split(" ");
		for(int i=0; i<a.length; i++) {
			num[i]=Integer.parseInt(a[i]);
		}
		
		System.out.println((num[0]*num[1])-(num[2]*num[3]*num[4]));
	}
}