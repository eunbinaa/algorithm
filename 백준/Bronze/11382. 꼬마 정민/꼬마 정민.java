import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long answer=0;
		for(int i=0; i<3; i++) {
			answer+=sc.nextLong();
		}
     
        System.out.println(answer);
	}

}
