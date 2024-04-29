import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		double result=0;
		while(true) {
			double bi = Double.parseDouble(br.readLine());
			if(bi<0) {
				break;
			}else {
				result=bi*0.167;
				sb.append("Objects weighing "+String.format("%.2f", bi)+" on Earth will weigh "+String.format("%.2f", result)+" on the moon."+'\n');
			}
		}
		System.out.println(sb.toString());
	}
}