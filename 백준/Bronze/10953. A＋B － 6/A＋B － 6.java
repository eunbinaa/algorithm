import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
		int T=Integer.parseInt(br.readLine());
		
		int[]num=new int[T];
		String[]str= {};
		for(int i=0; i<T; i++) {
			str=br.readLine().split(",");
			num[i]= Integer.parseInt(str[0])+Integer.parseInt(str[1]);        
		}
		
		for(int i : num) {
			System.out.println(i);
		}
	}

}