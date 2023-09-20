import java.util.Scanner;

public class Main {		
	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	int num=sc.nextInt();
	    	
	       for(int i=0; i<num; i++) {
	        	for(int k=num-1; k>i; k--) {
	        		System.out.print(" ");		
	        	}
	        	for(int n=0; n<=i; n++) {
	        		System.out.print("*");		
	        		
	        	}    	
	        	System.out.println();
	        }
	    	    	
	       	                  	            
     }
}
