public class ReverseInteger7 {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {

        int ans = 0;
        while (x != 0) { // != will deal with negative.
            if (ans > Integer.MAX_VALUE / 10) { //check if out of the boundary.
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
            System.out.println(ans);
        }
        return ans;
    }
}
