import java.io.*;
import java.util.*;

class Teste2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(System.in);
		PrintStream p = new PrintStream("s.txt");

		while(s.hasNextLine()) {

			p.println(s.nextLine());
		}
	}
}
