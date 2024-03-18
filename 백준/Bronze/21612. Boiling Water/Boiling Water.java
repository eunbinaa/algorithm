import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int num=Integer.parseInt(br.readLine());
	        int answer=5*num-400;    
	        System.out.println(answer);
	        if(answer==100){     
	            System.out.println("0");
	        }else if(answer>100){         
	            System.out.println("-1");
	        }else{
	             System.out.println("1");
	        }
		
	}
}