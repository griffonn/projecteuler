class projectEuler5 {
	public static void main(String[] args) {
		for (int n = 20; n > 0; n+=20) {
			for (int i = 20; i > 0; i--) {
				if (n % i != 0)
					break;
				if (i == 1) {
					System.out.println(n);
					return;
}	}	}	}	}