
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        ArrayList<Integer> list =new ArrayList<>();
        int sum=0;
        for(int i=0; i<num; i++) {
        	String str=br.readLine();
        	String[] arr=str.split(" ");
        	for(int j=0; j<arr.length; j++) {
        		sum+=Integer.parseInt(arr[j]);
        	}
        	list.add(sum);
        	sum=0;
        }
        
        for(Object i : list.toArray()) System.out.println(i);
	}
}