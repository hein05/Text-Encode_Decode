import java.util.HashMap;

public class Base64Encode extends HashMap {
    Padding padHelper;
    public Base64Encode() {
        padHelper = new Padding();
        char c;
        int count = 0;
        for (c = 'A'; c <= 'Z'; c++) {
            this.put(count, c);
            count += 1;
        }
        for (c = 'a'; c <= 'z'; c++) {
            this.put(count, c);
            count += 1;
        }
        for (int i = 0; i < 10; i++) {
            this.put(count, Integer.toString(i));
            count += 1;
        }
        this.put(count++, "+");
        this.put(count++, "/");
    }

    public int binaryToDecimal(String s) {
        int value = 0;
        int base = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                value += base;
            base *= 2;
        }
        return value;
    }

    public void printB64() {
        System.out.println(this.keySet().toString());
        System.out.println(this.values().toString());
    }
}