import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String a = br.readLine();
	    String[] str=a.split(" ");
	    int[]array= new int[num];
	    for(int i=0; i<str.length; i++) {
	    	array[i]=Integer.parseInt(str[i]);
	    }
	    Arrays.sort(array);
			
	System.out.println(array[array.length-1]-array[0]);
		 
	}
}