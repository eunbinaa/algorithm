import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=0;
		int answer=0;
		while(true) {
			String a=br.readLine();
			if(a.equals("0 0")) {
				break;
			}else {
				String[] str=a.split(" ");
				num=Integer.parseInt(str[0])*3;
				answer=num-Integer.parseInt(str[0])-Integer.parseInt(str[1]);
				sb.append(answer);
				sb.append('\n');
			}
		}
       System.out.println(sb.toString());
	    
	}
}