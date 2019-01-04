
public class HuffmanTree {

	Base64Encode en = new Base64Encode();
	public HuffmanTree() {
	}

	public void buildTree() {
		// System.out.println("Now mapChar Size:" + Manager.mapChar.size() );
		while (EncodeManager.mapChar.size() > 1) {
			this.buildBranch();
		}
	}

	public void buildBranch() {
		HuffmanNode l = new HuffmanNode();
		HuffmanNode r = new HuffmanNode();

		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				l = this.getMin();
			} else {
				r = this.getMin();
			}
		}
		int d = l.data.getCount() + r.data.getCount();
		String k = l.data.getLetter() + l.data.getLetter();
		HuffmanNode build = new HuffmanNode(k, d);
		build.left = l;
		build.right = r;
		l.parent = build;
		r.parent = build;

		EncodeManager.mapChar.put(k, build);
		// System.out.print(k);
	}

	private HuffmanNode getMin() {

		HuffmanNode m;
		m = findMinNode();
		EncodeManager.mapChar.remove(m.data.getLetter());
		return m;
	}

	public HuffmanNode findMinNode() {
		// System.out.println("MINNODE: " + Manager.mapChar.size());
		HuffmanNode tempMin = EncodeManager.mapChar.getFirstIndex();
		for (Object value : EncodeManager.mapChar.values()) {
			HuffmanNode v = (HuffmanNode) value;
			int tempInt = tempMin.data.getCount();
			int iterateInt = v.data.getCount();
			if (iterateInt <= tempInt) {
				tempMin = v;
				// System.out.print(iterateInt);
			}
			// System.out.print("Value" + v.data.getDataToString());
		}
		// System.out.print("Minimum Node is :" + tempMin.data.getDataToString());
		return tempMin;
	}

	public String getHuffBinary (HuffmanNode n,String s, String l) {
		String b = "";
		if (n == null) return b;
		if (isLeaf(n)) {
			if (n.data.getLetter().equals(l)) {
			return s;
			}
		}
		b += this.getHuffBinary(n.left, s + "0",l);
		b += this.getHuffBinary(n.right, s + "1",l);
		return b;
	}

	public void buildHuffmanTable() {
		// System.out.println("\nSIZE OF HASH IS : " + EncodeManager.mapChar.size());
		HuffmanNode root = EncodeManager.mapChar.getFirstIndex();
		this.buildHuffmanBinary(root, "");
	}

	public void buildHuffmanBinary(HuffmanNode n, String s) {
		if (n == null)
			return;
		buildHuffmanBinary(n.left, s + "0");
		if (isLeaf(n)) { // is leaf
			String letter = n.data.getLetter();
			String binary = s;
			String dec = Integer.toString(en.binaryToDecimal(binary));
			// System.out.println(binary + " " + letter);
			EncodeManager.HuffmanTable.put(dec, letter);
		}
		buildHuffmanBinary(n.right, s + "1");
	}

	Boolean isLeaf(HuffmanNode h) {
		return (h.left == null && h.right == null);
	}

}
