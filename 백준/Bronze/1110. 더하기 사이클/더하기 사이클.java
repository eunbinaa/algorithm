import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());		
		 if(num<10) {
			String arr=String.valueOf(num)+"0";
			num=Integer.parseInt(arr);
			
		}
		 String[]str=String.valueOf(num).split("");
		int count=0;
		String next="";
		
		while(num!=0) {
			int sum=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
			str[0]=str[1];
			if(sum>=10) {
				str[1]=String.valueOf(String.valueOf(sum).charAt(1));
			}else {
				str[1]=String.valueOf(sum);
			}
			
			count++;
			next=str[0]+str[1];
			int result=Integer.parseInt(next);
			if(result==num) {			
				break;
			}
		}
		if(num==0) {
			System.out.println(1);
		}else {
			System.out.println(count);	
		}
	}
}