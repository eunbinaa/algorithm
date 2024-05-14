import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str=br.readLine();	   
	  String[]arr= str.split(" ");
	  int a = Integer.parseInt(arr[0]);
	  int b= Integer.parseInt(arr[1]);
	  if(b<45) {
		  if(a==0) {
			  a=23;
		  }else {
			  a-=1;
		  }
		  b+=60;
		  b-=45;
	  }else {
		  b-=45;
	  }
	    System.out.println(a+" "+b);
	
	}
}