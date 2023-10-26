import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String set[]=br.readLine().split(" ");
		int L=Integer.parseInt(set[0]);
		int P=Integer.parseInt(set[1]);
		//int L=Integer.parseInt(br.readLine());
		//int P=Integer.parseInt(br.readLine());
		String num[]=br.readLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		int c=Integer.parseInt(num[2]);
		int d=Integer.parseInt(num[3]);
		int e=Integer.parseInt(num[4]);
		int sum=L*P;
		for(int i=0; i<num.length; i++) {
			System.out.print(Integer.parseInt(num[i])-sum+" ");
		}
		
		
	}

}
