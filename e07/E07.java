import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplicand multiplication table to show?");
        int num = scanner.nextInt();
        System.out.println("Until which multiplyer?");
        int num2 = scanner.nextInt();
        scanner.close();

        for (int i=1;i<num2+1;i++) {
            System.err.println(i + " x " + num +" = " + (i*num));
        }

    }
}