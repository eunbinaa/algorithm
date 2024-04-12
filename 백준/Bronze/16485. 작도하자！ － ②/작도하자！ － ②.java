import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		String[] array=str.split(" ");
	    if(Float.parseFloat(array[0])%Float.parseFloat(array[1])==0) {
	    	System.out.println(Integer.parseInt(array[0])/Integer.parseInt(array[1]));
	    }else {
	    	 System.out.printf("%.10f",Float.parseFloat(array[0])/Float.parseFloat(array[1]));
	    }
	    
	}
}