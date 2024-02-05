import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<>();
		int num=sc.nextInt();
		int answer=0;
		for(int i=0; i<num; i++) {
			list.add(sc.nextInt());
		}
		int a=sc.nextInt();
		
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i)==a) answer++;
        }
        System.out.println(answer);
	}

}
