import java.util.ArrayList;

//public class Tuple<left, right> {
//	private left letter;
//	private right count;
//	
//	public Tuple() {};
//	
//	public Tuple(left letter, right count) {
//		this.setTuple(letter, count);
//	}
//
//	public Tuple<left,right> getTuple() {
//		return new Tuple<left,right>(this.letter,this.count);
//	}
//
//	public void setTuple(left letter, right count) {
//		this.letter = letter;
//		this.count = count;
//	}
//}

public class HuffmanData {
	private String str;
	private int count = 0;
	
	public HuffmanData() {};
	
	//Construct Huffman Initialize Data
	public HuffmanData(String letter) {
		this.setData (letter, 1);
	}


	public HuffmanData (String l, int d) {
		this.setData(l, d);
	}
	
	public void setData (String letter, int i) {
		this.str = letter;
		this.count = i;
	}
	
	public void updateCount () {
		count += 1;
	}
	
	public int getCount () {
		return count;
	}
	
	public String getLetter () {
		return this.str;
	}
	
	public String getDataToString () {
		
		String s  = str + Integer.toString(count);
		return s;
	}
}
