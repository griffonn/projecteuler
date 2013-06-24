class projectEuler6 {
	public static void main(String[] args) {
		long sumofsq = 0, sqofsum = 0;

		for (long i = 0; i <= 100; i++) {
			sumofsq += i*i;
			sqofsum += i;
		}
		sqofsum *= sqofsum;

		System.out.println(sqofsum-sumofsq);
}	}