import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());
	
		if(90<=T && T<=100) {
			System.out.println("A");
		}else if(T>=80) {
			System.out.println("B");
		}else if(T>=70) {
			System.out.println("C");
		}else if(T>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
