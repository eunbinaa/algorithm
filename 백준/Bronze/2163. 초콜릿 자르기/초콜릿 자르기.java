import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int M=Integer.parseInt(str[0]);
		int N=Integer.parseInt(str[1]);
		 int answer = 0;;
	        if(M==1 && N==1){
	            answer=0;
	        }else{
	            answer=(M-1)+M*(N-1);              
	        }
	        
       
		System.out.println(answer);
	}
}