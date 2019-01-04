
public class HuffmanNode {
	
	HuffmanData data;
	
	HuffmanNode parent;
	HuffmanNode left;
	HuffmanNode right;
	
	
	public HuffmanNode () {}
	
	//Constructing Initialize HuffmanNode with DATA
	public HuffmanNode (String l) {
		this.parent = null;
		this.left = null;
		this.right = null;
		this.data = new HuffmanData(l);
	}
	
	//Constructing HuffmanNode and Link to parent
	public HuffmanNode (String l, int count) {
		this.data = new HuffmanData(l, count);
	}
	
	
}
