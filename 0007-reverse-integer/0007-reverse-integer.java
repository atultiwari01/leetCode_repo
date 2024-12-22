class Solution {
    public int reverse(int x) {
        String b = String.valueOf(x);
        String a = "";
        for (int i = b.length() - 1; i >= 0; i--) { 
            if (b.charAt(i) == '-') { 
                a = "-" + a;
            } else {
                a += b.charAt(i);
            }
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
