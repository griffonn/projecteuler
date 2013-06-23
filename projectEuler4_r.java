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
				if (rPalindrome(String.valueOf(i*j), len)) {
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

	private static boolean rPalindrome(String sn, int len) {
		if (len < 2)
			return true;
		if (len == 2 || len == 3)
			return (sn.charAt(0) == sn.charAt(len-1));
		if (sn.charAt(0) == sn.charAt(len-1))
			return rPalindrome(sn.substring(1, len-1), len-2);
		else
			return false;
	}
}