import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			double sum=0;
			double avg=0;
			for(int j=1; j<str.length; j++) {
				sum+=Integer.parseInt(str[j]);
			}
			avg=sum/Integer.parseInt(str[0]);
			double count=0;
			for(int j=1; j<str.length; j++) {
				if(Integer.parseInt(str[j])>avg) {
					count++;
				}
			}
			String a=String.format("%.3f", count/Integer.parseInt(str[0])*100);
			sb.append(a+"%").append('\n');
			
		}
		
		System.out.println(sb.toString());
	}
}