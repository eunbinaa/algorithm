import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());	
		int B=Integer.parseInt(br.readLine());	
		int C=Integer.parseInt(br.readLine());	
		int num=A*B*C;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		String[] str=String.valueOf(num).split("");
		
		for(int i=0; i<str.length; i++) {
			switch(Integer.parseInt(str[i])) {			
			case 1 :
			 map.put(1, map.getOrDefault(1, 0)+1);	
			 break;
			case 2 :
				 map.put(2, map.getOrDefault(2, 0)+1);
				 break;
			case 3 :
				 map.put(3, map.getOrDefault(3, 0)+1);
				 break;
			case 4 :
				 map.put(4, map.getOrDefault(4, 0)+1);
				 break;
			case 5 :
				 map.put(5, map.getOrDefault(5, 0)+1);
				 break;
			case 6 :
				 map.put(6, map.getOrDefault(6, 0)+1);
				 break;
			case 7 :
				 map.put(7, map.getOrDefault(7, 0)+1);
				 break;
			case 8 :
				 map.put(8, map.getOrDefault(8, 0)+1);
				 break;
			case 9 :
				 map.put(9, map.getOrDefault(9, 0)+1);
				 break;
			case 0 :
				 map.put(0, map.getOrDefault(0, 0)+1);
				 break;
			}
			
		}
		for(int i=0; i<10; i++) {
			System.out.println(map.getOrDefault(i,0));
		}
		
	}

}
