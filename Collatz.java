// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args [0]);
		int count = 1;
		System.out.print(n+ " ");
	    while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			System.out.print(n+ " ");
			count++;
		}
		System.out.println("(" +count+ ")");
	}
}
