import java.io.*;
import java.util.*;

class PegaTexto {

	public void getText(String archive) throws FileNotFoundException {

                InputStream is = new FileInputStream(archive);
                Scanner s = new Scanner(is);

                PrintStream ps = new PrintStream(archive);

                while(s.hasNextLine()) {

                        ps.println(s.nextLine());
                }

                ps.close();
                s.close();
        }

}
