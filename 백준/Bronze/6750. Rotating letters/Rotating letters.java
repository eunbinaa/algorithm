import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String a="NO";
	    String str=br.readLine();
	   
	  String[]arr= {"I", "O", "S", "H", "Z", "X", "N"};
	    for(int i=0; i<str.length(); i++) {
	    	for(int j=0; j<arr.length; j++) {
	    		if(!String.valueOf(str.charAt(i)).equals(arr[j])) {
		    		a="NO";
		    		continue;
		    	}else {
		    		a="YES";
		    		break;
		    	}
	    	}
	    }
	 
	    System.out.println(a);
	
	}
}