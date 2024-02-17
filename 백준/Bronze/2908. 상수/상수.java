
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb= new StringBuilder();
		String str=br.readLine();
		String[] arr=str.split(" ");
	    int a=0,b=0;
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		    sb.reverse();
		    if(i%2==0) {
		    	 a= Integer.parseInt(sb.toString());
		    }else {
		    	 b= Integer.parseInt(sb.toString());
		    }
		  
		    sb.delete(0, sb.length());
		}
	   	 
	    if(a<b) {
	    	System.out.println(b);
	    }else {
	    	System.out.println(a);
	    }
	}

}
