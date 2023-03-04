import java.io.*;
import java.util.*;

class TestaEntrada2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("arquivo.txt")));

		String s = br.readLine();

		while(s != null) {
		System.out.println(s);
		s = br.readLine();
		}

		br.close();
	}
}
