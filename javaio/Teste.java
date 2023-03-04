import java.io.*;

public class Teste {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader r = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(r);

		String s = b.readLine();

		while(s != null) {
			System.out.println(s);
			s = b.readLine();
		}

		b.close();

		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("funciona");

		bw.close();
	}
}
