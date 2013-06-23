class projectEuler4 {
	public static void main(String[] args) {
		long start = System.nanoTime();
		boolean[] palindromes = new boolean[1000000];
		for (int i = 0; i < 1000000 ; i++) {
			palindromes[i] = false;
		}
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				int len = 0, n = i*j;
				while (n > 0) {
					len++;
					n /= 10;
				}
				if (Palindrome(i*j, len)) {
					palindromes[i*j] = true;
				}
			}
		}

		for (int i = 1000000-1; i > 0; i--) {
			if (palindromes[i]) {
				System.out.println(i);
				System.out.println(System.nanoTime() - start);
				return;
			}
		}
	}

	private static boolean Palindrome(int n, int len) {
		String sn = Integer.toString(n);
		for (int i = 0; i < len/2; i++) {
			if (sn.charAt(i) != sn.charAt(len-1-i))
				return false;
		}
		return true;
	}
}