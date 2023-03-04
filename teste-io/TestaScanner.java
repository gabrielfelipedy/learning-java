import java.io.*;
import java.util.*;

class TestaScanner {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String saida = "saida.txt";

		PegaTexto p = new PegaTexto();
		p.getText(saida);

		Scanner s = new Scanner(System.in);

		OutputStream os = new FileOutputStream(saida, false);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		while(s.hasNextLine()) {

			String txt = s.nextLine();
			bw.write(txt);
			bw.newLine();

		}

		bw.close();
	}
}
