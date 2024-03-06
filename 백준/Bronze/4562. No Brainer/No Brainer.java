
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        ArrayList<String> list= new ArrayList<>();
        for(int i=0; i<num; i++) {
        	String str=br.readLine();
        	String[]arr=str.split(" ");
        	if(Integer.parseInt(arr[0])>=Integer.parseInt(arr[1])) {
        		list.add("MMM BRAINS");
        	}else {
        		list.add("NO BRAINS");
        	}
        }
       for(Object i : list.toArray()) System.out.println(i);
	}
}