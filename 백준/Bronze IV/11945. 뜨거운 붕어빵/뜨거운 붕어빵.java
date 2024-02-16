
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int answer=0;
		String str=br.readLine();	
		ArrayList<String> list=new ArrayList<>();
		String[] array=str.split(" ");
		int a=Integer.parseInt(array[0]);
		int b=Integer.parseInt(array[1]);
		
		StringBuilder sb= new StringBuilder("");
		for(int i=0; i<a; i++) {	
				sb.append(br.readLine());
				if(sb.length()==b) {
					list.add(sb.reverse().toString());
									
				}
				sb.delete(0, sb.length());
			
		}

		for(Object i : list.toArray())System.out.println(i);

	}

}
