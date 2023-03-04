import java.io.*;
import java.util.*;

class TestaEntrada {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Digite uma mensagem: ");
		String s = br.readLine();

		System.out.println(s);

		br.close();
	}
}
