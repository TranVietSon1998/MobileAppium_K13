package lessons;

public class Lesson2_Operator {
    public static void main(String[] args) {
        int n1 =10;
        int n2=20;

        //Left operand and right operand
        int total = n1+n2;
        System.out.println("Total: "+total);

        //Print with format: %d, %f, %b, %s
        System.out.printf("Total: %d",total);
        System.out.println();

        //Chia lay phan nguyen /
        System.out.println(5/2);
        //Chia lay phan du %
        System.out.println(5%2);


        float myFloatNumber = 10/3f;
        System.out.println(myFloatNumber);

        double myDoubleNumber = 10/3D;
        System.out.println(myDoubleNumber);
    }
}
