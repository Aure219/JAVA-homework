import java.util.Scanner;


public class helloworld {
	public static void main(String[] args) {
//		System.out.println("Welcome to java!");
//		System.out.println("Programming is fun!");
//		System.out.println("Fundamentals First");
//		System.out.println("Problem Driven");
//		System.out.print("(10.5+2*3)/(45-3.5) = ");//print显示完后不会移到下一行
//		System.out.println((10.5+2*3)/(45-3.5));
		Scanner input = new Scanner(System.in);
		int cm=input.nextInt();
		double m = cm / 100.0 / 0.3048;
		int foot = (int)(m);
		int inch =(int)((m-foot*1.0)*12);
		System.out.println(foot+" "+inch);
	}
}
