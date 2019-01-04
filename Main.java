
public class Main {
	public static void main(String[] args) {

		String[] plainFiles = { "Input.txt" };

		//Read File and Create Frequency List
		EncodeManager encoder = new EncodeManager(plainFiles[0]);
		encoder.processPlainFile(); 


		//Build Huffman Tree
		HuffmanTree t = new HuffmanTree();
		t.buildTree();
		t.buildHuffmanTable();

		//Use Huffman Tree to write Encoded Files
		encoder.writeToEncodedFiles();

		//Use Encoded File to Decode to Original Text
		String[] encodedFiles = { "Encoded_Input.txt" };
		DecodeManager decoder = new DecodeManager(encodedFiles[0],t);
		decoder.processEncodedFile();
	}

}
