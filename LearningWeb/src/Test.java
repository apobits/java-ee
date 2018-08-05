import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Test {

	public static String process(String s) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				even.append(s.charAt(i));
			} else {
				odd.append(s.charAt(i));
			}
		}

		return even.toString() + " " + odd.toString();
	}

	public static String process2(String s) {

		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();

		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				even.append(chars[i]);
			} else {
				odd.append(chars[i]);
			}
		}

		return even.toString() + " " + odd.toString();

	}

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		for (int i = 0; i < c.length - 1;) {

			if (i + 2 >= c.length) {
				count++;
				break;
			}

			if (c[i + 2] == 0) {
				i += 2;
			} else {
				i++;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int lines = scan.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < lines; i++) {
				sb.append(process2(scan.next()));
				sb.append("\n");
			}
			System.out.println(sb.toString());

		} catch (Exception e) {

		} finally {
			if (scan != null) {
				scan.close();
			}
		}

//		System.out.println(jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));

	}

}
