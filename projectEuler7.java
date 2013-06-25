import java.util.*;

class projectEuler7 {

	private static int number = 10001;
	private static List<Long> primes = new ArrayList<>();

	public static void main(String[] args) {
		long start = System.nanoTime();

		primes.add(2L);
		long c = 3L;

		while (primes.size() < number) {
			addPrime(c);
			c++;
		}

		System.out.println(primes.get(number-1));

		System.out.println((System.nanoTime() - start)/1000000000);
	}

	private static boolean addPrime(long n) {
		for (int i = 0; i < primes.size(); i++) {
			if (n % primes.get(i) == 0)
				return false;
		}
		primes.add(n);
		return true;
	}
}