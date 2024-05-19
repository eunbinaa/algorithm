import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int sum=0;
		for(int i=0; i<8; i++) {
			String[] str=br.readLine().split("");
			if(i%2==0) {
				for(int j=0; j<str.length; j++) {
					if(j%2==0) {
						if(str[j].equals("F")) {
							sum++;
						}
					}
				}
			}else {
				for(int j=0; j<str.length; j++) {
					if(j%2==1) {
						if(str[j].equals("F")) {
							sum++;
						}
					}
				}
			}
			
			
		}
		System.out.println(sum);
	}
}