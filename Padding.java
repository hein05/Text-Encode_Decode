class Padding {
    byte padAmt;

    Padding() {
        padAmt = 0;
    }

    void countToPad(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                padAmt++;
            } else {
                break;
            }
        }

    }
    String pad(String s) {
        for (int i = 1; i <= padAmt; i++)
            s += "=";
        return s;
    }
}