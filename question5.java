import java.util.*;
public class question5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int radius = sc.nextInt();
		System.out.println("Enter height: ");
		int height = sc.nextInt();
		double Volume = 3.14 * radius * radius * height;
		System.out.println(Volume);
	}
}