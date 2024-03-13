import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb= new StringBuilder();
		String str=br.readLine();
        int sum=0;
		String[] arr=str.split(" ");
	    int a=0,b=0;
		for(int i=0; i<arr.length; i++) {
			sum+=Integer.parseInt(arr[i]);
		}
	   	 
	    System.out.println(sum);
	}

}
