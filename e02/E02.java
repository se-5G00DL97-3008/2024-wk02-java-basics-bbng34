import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        int a, b;

        System.out.println("Give a number:");
        a = scanner.nextInt();
        System.out.println("Give another number:");
        b = scanner.nextInt();

        System.out.println();
        System.out.println(a+" + "+b + " = "+ (a+b));
        System.out.println(a+" * "+b + " = "+ (a*b));
        System.out.println(a+" - "+b + " = "+ (a-b));
        System.out.println(a+" / "+b + " = "+ (a/b));

        scanner.close();
    }
}