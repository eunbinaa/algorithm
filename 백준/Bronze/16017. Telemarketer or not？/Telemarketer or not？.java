import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
		if(a!=8 && a!=9) {
			System.out.println("answer");
		}else if(b!=c) {
			System.out.println("answer");
		}else if(d!=9 && d!=8) {
			System.out.println("answer");
		}else {
			System.out.println("ignore");
		}
	}
}