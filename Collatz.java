// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args [0]);
		String mode = args [1];
		if (mode.equals("v")) { 
			for (int i = 1; i <= n; i++) {
				int count = 1;
				int coll = i;
				System.out.print(coll+ " ");
				do {
					if (coll % 2 == 0) {
						coll /= 2;
					} else {
						coll = coll * 3 + 1;
					}
					System.out.print(coll+ " ");
					count++;
				} while (coll != 1);
				System.out.print("(" +count+ ")");
				System.out.println();
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} else System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
