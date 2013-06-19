class projectEuler2_r {
	public static void main(String[] args) {
		System.out.print(projectEuler2_rf(0, 1, 0));
	}

	public static int projectEuler2_rf(int first, int second, int result) {
		if (second > 4000000) {
			return result;
		}
		
		result += (second % 2 == 0) ? second : 0;
		return projectEuler2_rf(second, first+second, result);
		
	}
}