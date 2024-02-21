import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int[]nums=new int[8];
		int[]copy=new int[8];
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<8; i++) {
			nums[i]=Integer.parseInt(br.readLine());
			copy[i]=nums[i];
			map.put(nums[i], i+1);
		}
	    Arrays.sort(copy);
	    int[] copys=new int[5];
	    int sum=0;
	    int count=copys.length-1;
	    for(int i=copy.length-1; i>copy.length-6; i--) {
	    	copys[count]=copy[i];
	    	sum+=copy[i];
	    	count--;
	    }
	    for(int keys : map.keySet()) {
	    	for(int i=0; i<copys.length; i++) {
	    		if(copys[i]==keys) {
	    			copys[i]=map.get(keys);
	    		}
	    	}
	    }
	    Arrays.sort(copys);
	    System.out.println(sum);
	    for(int i : copys)System.out.print(i+" ");
	}
}