import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0; i<6; i++){
            String a=br.readLine();
            if(a.equals("W")){
                sum+=1;
            }
        }
	    if(sum>=5){
            System.out.println("1");
        }else if(sum>=3){
            System.out.println("2");
        }else if(sum>=1){
            System.out.println("3");
        }else{
            System.out.println("-1");
        }
	}
}