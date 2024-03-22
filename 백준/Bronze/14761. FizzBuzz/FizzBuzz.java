import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              String str=br.readLine();
              String[]arr=str.split(" ");

                 for(int i=1; i<=Integer.parseInt(arr[2]); i++){
	          if(i%Integer.parseInt(arr[0])==0){
                  if(i%Integer.parseInt(arr[1])==0){
                       System.out.println("FizzBuzz");
                  }else{
                    System.out.println("Fizz");  
                  }
              }else if(i%Integer.parseInt(arr[1])==0){
                         System.out.println("Buzz");   
                     }else{
                  System.out.println(i);
                   }         
	       }
	}
}
