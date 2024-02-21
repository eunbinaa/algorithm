import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> nums= new ArrayList<>();
		for(int i=1; i<=30; i++) {
			list.add(i);
		}
		int a=0;
		for(int i=0; i<28; i++) {
			a=Integer.parseInt(br.readLine());
			for(int j=0; j<list.size(); j++) {
				if(a==list.get(j)) {
					list.remove(j);	
					break;
				}
			}
			
		}
		for(Object i : list.toArray())System.out.println(i);
	}
}