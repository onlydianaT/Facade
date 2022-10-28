public class BinOps {
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int sum = aInt + bInt;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int mult = aInt * bInt;
        String result = Integer.toBinaryString(mult);
        return result;

    }
}
