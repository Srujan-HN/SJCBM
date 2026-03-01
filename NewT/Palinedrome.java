package NewT;

public class Palinedrome {
    public static void main(String[] args) {
        int num = 123;
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);

//        if (original == reversed) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a Palindrome");
//        }
    }
}
