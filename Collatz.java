// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args [0]);
		int count = 1;
		System.out.print("1 4 2 1 (4)");
		System.out.println();
		for (int i = 2; i <= n; i++) {
			int coll = i;
			System.out.print(coll+ " ");
			while (coll != 1) {
				if (coll % 2 == 0) {
					coll /= 2;
				} else {
					coll = coll * 3 + 1;
				}
				System.out.print(coll+ " ");
				count++;
			}
			System.out.print("(" +count+ ")");
			System.out.println();
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
