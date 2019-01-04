import java.util.HashMap;

public class HashIndex extends HashMap {
	// Index storage using hashing with chaining
	public HashIndex () {
		super();
	}
	
	public HuffmanNode find(String letter) {
		if (this.containsKey(letter)) {
			HuffmanNode h = (HuffmanNode) this.get(letter);
			return h;
		}
		return null;
	}
	
	public void initialHashing (char letter, HuffmanNode node) {
		this.put(letter, node);
	}
	
	public void updateHashing (String letter) {
		HuffmanNode existingNode = (HuffmanNode) this.get(letter);
		existingNode.data.updateCount();
		this.put(letter, existingNode);
	}
	
	public HuffmanNode getFirstIndex () {
//		System.out.println("Printing Key " + this.size());
		Object firstKey = this.keySet().toArray()[0];
		return (HuffmanNode) this.get(firstKey);
	}
	
	public int hashSize () {
		return this.size();
	}
	
	public String getBinary (String key) {
		Object s = this.get(key);
		String str = String.valueOf(s);
		System.out.println("Getting Binary :" + s);
		return str;
	}
	
	public void printHash () {
		System.out.println(this.keySet().toString());
		// System.out.println(this.values().toArray());
		// for (Object key: this.keySet()) {
		// 	key = (String) key;
		// 	System.out.print(key);
		// }
		// System.out.println();
		for (Object value: this.values()) {
			HuffmanNode v = (HuffmanNode) value;
			System.out.print(v.data.getDataToString() + " ");
			// System.out.println();
		}
	}
}

