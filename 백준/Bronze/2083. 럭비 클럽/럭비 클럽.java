
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list =new ArrayList<>();
        while(true) {
        	String str= br.readLine();
        	String[] arr= str.split(" ");
        	if(arr[0].equals("#")) {
        		break;
        	}else {
        		String state="";
            	if(Integer.parseInt(arr[1])>17 || Integer.parseInt(arr[2])>=80) {
            		state="Senior";
            	}else {
            		state="Junior";
            	}
            	list.add(arr[0]+" "+state);
            	
        	}
        	
        }
	    
	    for(Object i : list.toArray()) System.out.println(i);
	}
}