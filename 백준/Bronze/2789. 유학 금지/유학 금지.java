import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
			for(int i=0; i<a.length(); i++) {
				switch(String.valueOf(a.charAt(i))) {
				case "C":
					a = a.replace("C", "");
					i=-1;
					break;
				case "A":
					a =a.replace("A", "");
					i=-1;
					break;
				case "M":
					a =a.replace("M", "");
					i=-1;
					break;
				case "B":
					a =a.replace("B", "");
					i=-1;
					break;
				case "R":
					a =a.replace("R", "");
					i=-1;
					break;
				case "I":
					a =a.replace("I", "");
					i=-1;
					break;
				case "D":
					a =a.replace("D", "");
					i=-1;
					break;
				case "G":
					a =a.replace("G", "");
					i=-1;
					break;
				case "E":
					a =a.replace("E", "");
					i=-1;
					break;
				}
			}
			
	System.out.println(a);
		 
	}
}