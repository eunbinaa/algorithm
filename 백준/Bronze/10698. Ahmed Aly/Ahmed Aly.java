import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list = new ArrayList();
                int num=Integer.parseInt(br.readLine());
               for(int i=0; i<num; i++){
	              String str=br.readLine();
                  String[]arr=str.split(" ");
                  if(arr[1].equals("+")){
                       if(Integer.parseInt(arr[0])+Integer.parseInt(arr[2])==Integer.parseInt(arr[4])){
                       list.add("YES");    
                       }else{
                       list.add("NO");
                       }
                   }else{
                     if(Integer.parseInt(arr[0])-Integer.parseInt(arr[2])==Integer.parseInt(arr[4])){
                       list.add("YES");    
                       }else{
                       list.add("NO");
                       }
                   }	       
	       }
 
             for(int i=0; i<list.size(); i++){
             System.out.println("Case "+(i+1)+": "+list.get(i));
           }


	      	
	}
}