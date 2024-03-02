import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        String[] arr=str.split(" ");
        int[] nums=new int[2];
        nums[0]=Integer.parseInt(arr[0]);
        nums[1]=Integer.parseInt(arr[1]);
    
       
            if(nums[0]>=nums[1]){
                System.out.println(nums[0]);
            }else{
                System.out.println(nums[1]);
            }
        
        
	}
}