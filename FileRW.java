import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;


public class FileRW {

	BufferedReader br;
	BufferedWriter bw;

	String fileName;

	FileRW (String preFix,String fileName) {
		this.fileName = fileName;
		try {
			bw = new BufferedWriter(new FileWriter(preFix + fileName, true));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void processFile(boolean last, Function<String, Void> processChar) {

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "US-ASCII"));
			int c; // ASCII Index
			while ((c = br.read()) != -1) {
				char character = (char) c;
				String str = Character.toString(character);
				processChar.apply(str);
			}
			if (last) processChar.apply("last");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void closeRead () {
		try {
		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile (String str) {

		try {
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void closeWrite () {
		try {
		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
