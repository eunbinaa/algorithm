import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] num=new int[3];
		 while(true) {
			 num[0]=sc.nextInt();
			 num[1]=sc.nextInt();
			 num[2]=sc.nextInt();
			 if(num[0]==0 &&num[1]==0 &&num[2]==0 )break;
			 else{
				 Arrays.sort(num);
				 if(Math.pow(num[0],2)+Math.pow(num[1],2)==Math.pow(num[2],2)) {
					 System.out.println("right");
				 }else {
					 System.out.println("wrong");
				 }
			 }
			 
		 }
 
		}

}
