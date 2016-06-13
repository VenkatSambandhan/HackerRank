import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			int value = (int) P[0].charAt(0);
			System.out.println(P[0].charAt(0));
			boolean found = false;
			outer: for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if ((int) (G[i].charAt(j)) == value) {
						for (int a = 0, k = i; a < P.length && k<=; a++, k++) {
							for (int b = 0, l = j; b < P[i].length() && l <=; b++, l++) {
								if (G[t].charAt(l) == P[a].charAt(b))
									continue;
								else
									found = false;
							}
						}

						found = true;
					}
					if (found) {
						System.out.println("YES");
						break outer;
					}

				}
			}
			if (found = false)
				System.out.println("NO");

		}
	}
}
