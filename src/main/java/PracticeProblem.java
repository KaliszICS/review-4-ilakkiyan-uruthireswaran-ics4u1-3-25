import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word;
		word = "5" + in.nextLine();
		System.out.println(Integer.parseInt(word) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String var;
		var = "4" + in.nextLine() + "3";
		System.out.println(Double.parseDouble(var) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String x;
		x = in.nextLine();
		System.out.println(!Boolean.parseBoolean(x));
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String y;
		y = in.nextLine() + "3";
		int num = Integer.parseInt(y) + 2;
		System.out.println((char)num);

		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String free;
		free = in.nextLine() + "1";
		int r = Integer.parseInt(free) / 2;
		System.out.println((double) r);
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String run;
		run = "1" + in.nextLine();
		double p = Double.parseDouble(run);
		System.out.println((int) p);
		
	}

}
