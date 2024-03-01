
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int count=1;
        while(num>=1) {
        	if(num==1) {
        		break;
        	}else if(num%2==0) {
        		num/=2;
        		count++;
        	}else {
        		num=num*3+1;
        		count++;
        	}
        }
       System.out.println(count);
	}
}