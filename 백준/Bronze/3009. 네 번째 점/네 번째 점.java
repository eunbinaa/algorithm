import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][]num= new int[3][2];
		for(int i=0; i<3; i++) {
			String a= br.readLine();
			String[]array=a.split(" ");
		    for(int j=0; j<2; j++) {
		    	
		    	  num[i][j]=Integer.parseInt(array[j]);
		    	
		    }
		}
		int x=0;
		int y=0;
		
			if(num[0][0]==num[1][0]) {
				x=num[2][0];
				
			}else if(num[0][0]==num[2][0]){
				x=num[1][0];
				
			}else {
				x=num[0][0];
				
			}
		
		
			if(num[0][1]==num[1][1]) {
				y=num[2][1];
				
			}else if(num[0][1]==num[2][1]){
				y=num[1][1];
				
			}else {
				y=num[0][1];
				
			}
		
		
		 System.out.println(x +" "+y);
		
		 
		 
	}
}