package algo;

import java.util.HashMap;

public class ClosestPoint {

	public static void main(String[] args) {
		int[][] point = { { 1, 2 }, { 4, 5 }, { 6, 7 } };
		int[] comppoint = { 3, 4 };

		double minorDistance = 1000000;
		int minPoint = 99;

		for (int i = 0; i < point.length; i++) {
			double distance = distance(point[i], comppoint);
			if (distance < minorDistance) {
				minorDistance = distance;
				minPoint = i;
			}

		}
		System.out.println("Minor distance: " + point[minPoint][0] + point[minPoint][1]);

	}

	public static double distance(int[] p, int[] q) {
		double ret = Math.sqrt(Math.pow(q[0] - p[0], 2) + Math.pow(q[1] - p[1], 2));
		return ret;
	}
}
