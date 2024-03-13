import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	    int num=Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList();
		for(int i=0; i<num; i++) {
			list.add(br.readLine());
		}
       for(int i=0; i<list.size(); i++){
           if(list.get(i).contains("S")){
               System.out.println(list.get(i));
               break;
           }
       }
	    
	}

}