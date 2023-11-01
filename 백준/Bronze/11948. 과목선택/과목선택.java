
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		
		 int sum=0;
		 int[] si=new int[4];
		 for(int i=0; i<4; i++) {
			 si[i]=sc.nextInt();
		 }
		 Arrays.sort(si);
		 int[] so=new int[2];
		for(int i=0; i<2; i++) {
			so[i]=sc.nextInt();
		}
		Arrays.sort(so);
		sum+=si[1]+si[2]+si[3]+so[1];
		System.out.println(sum);
		
	}

}