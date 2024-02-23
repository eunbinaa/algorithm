import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list =new ArrayList<>();
        while(true) {
        	int N= Integer.parseInt(br.readLine());
        	if(N==0) {
        		break;
        	}else {
        		String str= String.valueOf(N);
            	String[] arr= str.split("");
            	int sum=str.length()+1;
            	for(int i=0; i<arr.length; i++) {
            		if(arr[i].equals("0")) {
            			sum+=4;
            		}else if(arr[i].equals("1")) {
            			sum+=2;
            		}else {
            			sum+=3;
            		}
            	}
            	list.add(sum);
            	sum=0;
        	}
        	
        }
	    
	    for(Object i : list.toArray()) System.out.println(i);
	}
}