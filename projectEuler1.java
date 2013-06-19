class projectEuler1 {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 3; i < 1000; i++) {
			result += (i % 3 == 0 || i % 5 == 0) ? i : 0;
		}
		System.out.print(result);
	}
}