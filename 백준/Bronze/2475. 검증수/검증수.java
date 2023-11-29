

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str[]=br.readLine().split(" ");
			int sum=0;
			for(String a : str) {
				sum+=Integer.parseInt(a)*Integer.parseInt(a);
			}
			System.out.println(sum%10);

	}

}