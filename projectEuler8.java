import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class projectEuler8 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String s;

		try {
			long start = System.nanoTime();
			br = new BufferedReader(new FileReader("projectEuler8.txt"));
			s = br.readLine();
			int max = 0;
			for (int i = 0; i < s.length() - 5; i++) {
				String chunk = s.substring(i, i+5);
				int num = 1;
				for (int j = 0; j < 5; j++) {
					num *= Integer.parseInt(chunk.substring(j, j+1));
				}
				max = (max >= num) ? max : num;
			}

			System.out.println(max);
			System.out.println(System.nanoTime() - start);
		} catch (IOException e) { e.printStackTrace(); }
		finally { try {
			if (br != null)br.close();
		} catch (IOException ex) { ex.printStackTrace(); } }

	}
}