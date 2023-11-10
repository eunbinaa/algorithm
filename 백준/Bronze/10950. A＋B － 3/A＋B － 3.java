import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
	    int D=Integer.parseInt(br.readLine());
	    int[] nums=new int[D];
	    for(int i=0; i<D; i++) { 
	    	StringTokenizer s=new StringTokenizer(br.readLine());
	        	int a= Integer.parseInt(s.nextToken());
	        	int b= Integer.parseInt(s.nextToken());
	        
	    	nums[i]=a+b;
	    }
	    for(int i : nums) {
	    	System.out.println(i);
	    }
	}

}
