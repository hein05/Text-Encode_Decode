import java.util.HashMap;

public class Base64Decode extends HashMap {
    public Base64Decode() {
        char c;
        int count = 0;
        for (c = 'A'; c <= 'Z'; c++) {
            String s = Character.toString(c);
            // String v = Integer.toString(count);
            this.put(s, count);
            count += 1;
        }
        for (c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            // String v = Integer.toString(count);
            this.put(s, count);
            count += 1;
        }
        for (int i = 0; i < 10; i++) {
            // String v = Integer.toString(count);
            this.put(Integer.toString(i), count);
            
            count += 1;
        }

        this.put("+", count++);
        this.put("/", count++);
    }
    public String DecimalToBinary(int d) {
        String binary = "";
       
        while (d > 0) {
            binary = Integer.toString(d % 2) + binary;
            d = d /2 ;
            // System.out.print(d + " " );
        }
        return binary;
    }

    public String binaryPad (String s) {
        String n = s;
        for (int i = 0; i < 6 - n.length(); i++) {
            s = "0" + s;
        }
        return s;
    }

    public void printB64() {
        System.out.println(this.keySet().toString());
        System.out.println(this.values().toString());
    }
}