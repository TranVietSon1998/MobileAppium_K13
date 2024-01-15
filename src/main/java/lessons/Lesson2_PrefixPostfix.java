package lessons;

public class Lesson2_PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        System.out.printf("a = %d; b = %d; c = %d", a, b, c);

        //Prefix(++)a, b(++) Postfix
        //Prefix > right operand > assign value for left operand > postfix

    }
}
