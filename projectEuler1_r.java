class projectEuler1_r {
	public static void main(String[] args) {
		System.out.print(projectEuler1_rf(3, 1000, 0));
	}

	public static int projectEuler1_rf(int needle, int stop, int result) {
		if (needle >= stop) {
			return result;
		}
		
		result += (needle % 3 == 0 || needle % 5 == 0) ? needle : 0;
		return projectEuler1_rf(++needle, stop, result);
	}
}