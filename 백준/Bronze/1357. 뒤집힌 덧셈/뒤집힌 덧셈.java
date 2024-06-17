import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String[]str=br.readLine().split(" ");
		for(int i=0; i<str.length; i++) {
			sb.append(str[i]);
			sb.reverse();
			str[i]=sb.toString();
			if(str[i].startsWith("0")) {
				while(str[i].startsWith("0")) {
					str[i]=str[i].substring(1);
				}
			}
			sb.delete(0, sb.length());
		}
		int a=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
        String answer=String.valueOf(a);
        sb.append(a).reverse();
        answer=sb.toString();
        if(answer.startsWith("0")) {
			while(answer.startsWith("0")) {
				answer=answer.substring(1);
			}
		}
		System.out.println(answer);
	}
}