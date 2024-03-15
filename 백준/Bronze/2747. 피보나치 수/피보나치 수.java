import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int[]array=new int[num+1];
        array[0]=0;
        array[1]=1;
        for(int i=2; i<array.length; i++){
            array[i]=array[i-1]+array[i-2];
        }
        System.out.println(array[num]);
	   
	}
}