class projectEuler3 {
	public static void main(String[] args) {
		long n = 600851475143L;
		for (int i = 3; i < n; i++) {
			long c = n % i;
			if (c == 0) {
				if (isPrime(i)) {
					System.out.println(i);
					// return;
				}
			}
		}
	}

	private static boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		}
		for (long i = 3; i*i < n; i+=2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}