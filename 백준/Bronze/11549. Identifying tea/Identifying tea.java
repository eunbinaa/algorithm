import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());      
        String str=br.readLine();
        String[] arr=str.split(" ");
        int sum=0;    
        	for(int i=0; i<arr.length; i++) {
                if(num==Integer.parseInt(arr[i])){
                    sum+=1;
                }
        		
        	}
         System.out.println(sum);
	}
}