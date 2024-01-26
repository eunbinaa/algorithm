import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		 Map<Integer, Integer> map=new HashMap<>();
		 int count=0;
		 while(count<10) {
			 int a=sc.nextInt();
			 int b=a%42;						
		     map.put(b,b);	
		     count++;
		 
		 }
		
      System.out.println(map.size());
		}

}
