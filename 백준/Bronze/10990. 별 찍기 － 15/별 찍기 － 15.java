import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
        	for(int j=i+1; j<num; j++) {
        		System.out.print(" ");
        	}
        	for(int j=0; j<2*(i+1)-1; j++) {    	
        		if(j==0 || j==2*(i+1)-2) {
        			System.out.print("*");  
        		}else {
        			System.out.print(" ");
        		}
       			    		       		
        	}       	
        	System.out.println("");
        }
       
	}
}