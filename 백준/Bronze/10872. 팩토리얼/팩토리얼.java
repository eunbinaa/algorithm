import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		
		 int sum=1;
		 int N= sc.nextInt();
		for(int i=N; i>=1; i--) {
			sum*=i;
		}
		System.out.println(sum);
		 
	}

}