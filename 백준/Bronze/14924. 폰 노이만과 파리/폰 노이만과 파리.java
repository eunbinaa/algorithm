import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        String[] arr=str.split(" ");
        int[] num=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num[i]=Integer.parseInt(arr[i]);
        }
        int a=num[2]/(num[0]*2);
        int answer=a*num[1];
        System.out.println(answer);
        
	}
}