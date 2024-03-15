import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		 String str =br.readLine();
	        String[]arr=str.split(" ");
	        for(int i=0; i<arr.length; i++){
	           arr[i]= arr[i].replace("6", "5");	       
	       }
	       int a=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
	         for(int i=0; i<arr.length; i++){
	          arr[i]=  arr[i].replace("5", "6");        
	       }
	        int b=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
	        System.out.println(a+" "+b);   	
	}
}