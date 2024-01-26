
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer=0;
		int num=Integer.parseInt(br.readLine());
		Stack<Character> st=new Stack<>();
		String s="";
		for(int i=0; i<num; i++) {
			String str=br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(st.isEmpty()) {
					if(str.length()==1) {
						answer++;
						break;
					}else{
						st.push(str.charAt(j));						
					}
									
				}else if(st.peek()==str.charAt(j)) {				
						st.push(str.charAt(j));							
				}else{
					if(st.contains(str.charAt(j))==true) {					
				         break;						
					}else {
						st.push(str.charAt(j));						
					}				    			     
				}	
			}
			if(st.size()==str.length())
				answer++;
			st.clear();			
		}
		System.out.println(answer);

	}

}
