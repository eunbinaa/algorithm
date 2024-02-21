
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num=Integer.parseInt(br.readLine());
		int a=0,b=0;
		BigInteger sum=new BigInteger("1");
		BigInteger sum2=new BigInteger("1");
		int[] answer=new int[num];
		for(int i=0; i<num; i++) {			
			String str=br.readLine();
			String[] arr=str.split(" ");
			a=Integer.parseInt(arr[0]);
			b=Integer.parseInt(arr[1]);		
		    for(int j=b; j>a; j--) {
		    	sum=sum.multiply(BigInteger.valueOf(j));		
		    	
		    }		   
		    for(int k=b-a; k>0; k--) {		    	
		    	sum2=sum2.multiply(BigInteger.valueOf(k));
		    		
		    }		
		    answer[i]=sum.divide(sum2).intValue();		
		 sum=BigInteger.valueOf(1);
		 sum2=BigInteger.valueOf(1);
		}
	  for(long i : answer)System.out.println(i);
	
	}
}