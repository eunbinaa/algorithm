

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     	int T=Integer.parseInt(br.readLine());		
	    int D=Integer.parseInt(br.readLine());
	    if(T==2) {
	    	if(D>18) {
	    		System.out.println("After");
	    	}else if(D<18) {
	    		System.out.println("Before");
	    	}else {
	    		System.out.println("Special");
	    	}
	    }else if(T<2) {
	    	System.out.println("Before");
	    }else {
	    	System.out.println("After");
	    }
	}

}
