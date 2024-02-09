import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;



public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());	
				
		HashMap<String, Integer>map=new HashMap<>();
		
	for(int j=0; j<A; j++) {
		for(int i=0; i<9; i++) {
			String str=br.readLine();
			String newStr = str.replaceAll("\\s", "");
			map.put("y", map.getOrDefault("y", 0)+Integer.parseInt(newStr.substring(0,1)));
			map.put("k", map.getOrDefault("k", 0)+Integer.parseInt(newStr.substring(1,2)));
		}		
		if(map.get("y")>map.get("k")) {
			System.out.println("Yonsei");
		}else if(map.get("y")<map.get("k")) {
			System.out.println("Korea");
		}else {
			System.out.println("Draw");
		}
		map.clear();
	}	
		
	}

}
