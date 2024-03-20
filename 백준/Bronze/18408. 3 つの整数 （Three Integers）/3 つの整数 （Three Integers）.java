import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
		 String str =br.readLine();		 
        String[] arr= str.split(" ");
        int a=0;
        int b=0;
	    for(int i=0; i<arr.length; i++) {
	    	if(Integer.parseInt(arr[i])==1){
                a++;
            }else{
                b++;
            }	    
	    }
        if(a>b){
            System.out.println(1);
        }else{
             System.out.println(2);     
        }
	   
	}
}