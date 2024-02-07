import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());		
		int answer,sum;		
		int[]jumsu=new int[num];
		for(int i=0; i<num; i++) {
			sum=0;
			answer=0;
			String str=br.readLine();
			String[] arr= str.split("");
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("O")) {									
						answer++;			
				}else {
					answer=0;
				}	          
			  sum+=answer;				  
			}
			jumsu[i]=sum;					
		}
		
		
		for(int i : jumsu) {
			System.out.println(i);
		}
		
	}

}
