
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
        	if(i%2==0) {
        		for(int j=0; j<num; j++) {
            		System.out.print("* ");
            	 }

        	}else {
        		for(int j=0; j<num; j++) {
            		System.out.print(" *");
            	}
        	}
        	System.out.println("");
        	/*for(int j=0; j<num/2; j++) {
        		System.out.print(" *");
        	}
        	System.out.println("");*/
        }
	}
}