
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<>();
		while(true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			list.add(a+b);
		}
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
	}

}
