import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int alphabet[]=new int[26];
		String str= br.readLine();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=96){ //대문자
				++alphabet[str.charAt(i)-65];
			}else {//소문자
				++alphabet[str.charAt(i)-97];
			}
		}
		
		int max=-1;
		char c='?';
		for(int i=0; i<alphabet.length; i++) {
			if(max<alphabet[i]) {
				max=alphabet[i];
				c= (char)(i+65);
			}else if(max==alphabet[i]) {
				c='?';
			}
		}
		
		System.out.println(c);

	}

}
