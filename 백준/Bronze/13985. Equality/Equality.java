import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
        String str=br.readLine();
        String[] arr=str.split(" ");
        int sum=0;    
        if(Integer.parseInt(arr[0])+Integer.parseInt(arr[2])==Integer.parseInt(arr[4])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
         
	}
}