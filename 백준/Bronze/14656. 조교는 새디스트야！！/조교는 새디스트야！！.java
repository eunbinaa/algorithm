import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		String[] str= br.readLine().split(" ");
		int sum=0;
		for(int i=0; i<num; i++) {
			if((i+1)!=(Integer.parseInt(str[i]))) {
				sum+=1;
			}
		}
		System.out.println(sum);
	}
}