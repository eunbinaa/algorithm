import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
		String jinho=br.readLine();
	    int D=Integer.parseInt(br.readLine());
	    int s=0;
	    for(int i=0; i<D; i++) {
	    	String other =br.readLine();
	    	if(jinho.equals(other)) {
	    		s++;
	    	}
	    }
	    System.out.println(s);
	}

}
