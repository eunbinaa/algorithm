import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str=br.readLine();
               String[]arr=str.split(" ");
         try{      
          System.out.println( Integer.parseInt(arr[0])-Integer.parseInt(arr[1]));           
         }catch(Exception e){
          System.out.println("NaN");
          }

	      	
	}
}
