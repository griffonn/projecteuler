class projectEuler6_r {
	public static void main(String[] args) {
		final int MAX = 100;
		long sumofsq = rSumofsq(MAX);
		long sqofsum = rSqofsum(MAX, 0);
		System.out.println(sqofsum-sumofsq);
	}

	private static long rSumofsq(int limit) {
		if (limit <= 0)
			return 0;
		return limit*limit + rSumofsq(limit-1);
	}

	private static long rSqofsum(int limit, long result) {
		if (limit <= 0)
			return result*result;
		return rSqofsum(limit-1, result+limit);
	}
}