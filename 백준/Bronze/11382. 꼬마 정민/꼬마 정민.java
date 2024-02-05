import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> list= new ArrayList<>();
		long answer=0;
		for(int i=0; i<3; i++) {
			list.add(sc.nextLong());
		}
		
		
        for(int i=0; i<list.size(); i++) {
        	answer+=list.get(i);
        }
        System.out.println(answer);
	}

}
