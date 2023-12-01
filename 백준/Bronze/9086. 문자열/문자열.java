import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			String[] sb= {};
			sb=new String[n];
			String str="";
			int count=0;
			while(count<n) {
				 str=br.readLine();
				 if(str.length()<=1) {
						sb[count]=str+str;
						}else {
							sb[count]=String.valueOf(str.charAt(0))+String.valueOf(str.charAt(str.length()-1));
						}
				 count++;
			}
			
			
		for(String a : sb) {
			System.out.println(a);
		}

	}

}
