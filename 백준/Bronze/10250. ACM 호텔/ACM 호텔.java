import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num= Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[] str=br.readLine().split(" ");
			if(Integer.parseInt(str[2])%Integer.parseInt(str[0])==0) {
				sb.append(Integer.parseInt(str[0]));
                 if(Integer.parseInt(str[0])*10>Integer.parseInt(str[2])&&Integer.parseInt(str[2])/Integer.parseInt(str[0])<10) {				
					sb.append("0");
				}
				sb.append(Integer.parseInt(str[2])/Integer.parseInt(str[0]));
			}else {
				sb.append(Integer.parseInt(str[2])%Integer.parseInt(str[0]));
                    if(Integer.parseInt(str[0])*10>Integer.parseInt(str[2])&&Integer.parseInt(str[2])/Integer.parseInt(str[0])+1<10) {
					
					sb.append("0");
				}
				sb.append(Integer.parseInt(str[2])/Integer.parseInt(str[0])+1);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}