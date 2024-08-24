public class test {
    public static void bintodec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (decNum + lastdigit * (int) Math.pow(2, pow));
            pow++;

            binNum = binNum % 10;
        }
        System.out.println(" decimal of " + myNum + decNum);
    }

    public static void main(String[] args) {
        bintodec(101);
    }
}