import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num= Integer.parseInt(br.readLine());
		ArrayList<Double> list = new ArrayList();
		double sum=0;
		for(int i=0; i<num; i++) {
			String a=br.readLine();
			String[]str=a.split(" ");
			sum=Double.parseDouble(str[0]);
			for(int j=1; j<str.length; j++) {
				switch(str[j]) {
				case "@":
					sum*=3;
					break;
				case "%":
					sum+=5;
					break;
				case "#":
					sum-=7;
					break;
				}
			}
			list.add(sum);
		}
		
		
				
	for(int i=0; i<list.size(); i++) {
		System.out.printf("%.2f",list.get(i));
		System.out.println();
	}
		 
		 
	}
}