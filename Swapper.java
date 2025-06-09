public class Swapper {
    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Number before swapping are: a:" + a + " b:" + b);
        int[] result = Swapper.swap(a, b);
        System.out.println("Number after swapping are: a:" + result[0] + " b:" + result[1]);
    }
}
