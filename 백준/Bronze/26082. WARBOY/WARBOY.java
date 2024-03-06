
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str=br.readLine();
    	String[]arr=str.split(" ");
    	int answer=0;
    	answer=Integer.parseInt(arr[1])/Integer.parseInt(arr[0])*Integer.parseInt(arr[2]);
    	
        System.out.println(answer*3);    	
	}
}