import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String a=br.readLine();
			if(a.equals("0")) {
				
				break;
			}else {
				StringBuffer bf=new StringBuffer(a).reverse();
				String b=bf.toString();
				if(a.equals(b)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			
			}
		}
	 
	}
}