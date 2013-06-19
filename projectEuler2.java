class projectEuler2 {
	public static void main(String[] args) {
		int result = 0;
		int i = 0, j = 1, next = 0;
		while (next < 4000000) {
			next = i + j;
			result += (j % 2 == 0) ? j : 0;
			i = j;
			j = next;
		}
		System.out.print(result);
	}
}