import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());
		List<String> list= new ArrayList<String>();
		Set<String> set = new HashSet<>();
	    String temp="";
		for(int i=0; i<A; i++) {
			set.add(br.readLine());
			
		}
		
		list= new ArrayList<>(set);
		String[] str=new String[list.size()];
		for(int i=0; i<str.length; i++)str[i]=list.get(i);
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length()-o2.length();
				}
			}
			
		});
		
	
	  for(String a :str) System.out.println(a);
	}

}
