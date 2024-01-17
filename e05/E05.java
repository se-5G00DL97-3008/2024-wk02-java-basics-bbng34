import java.util.Scanner;

class E05 {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        String days[] = {"Monday","Tuesday","Wednesday","Thursay","Friday","Saturday","Sunday"};

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

            switch (num) {
                case 1:
                System.out.println(days[0]);
                    break;
                case 2:
                System.out.println(days[1]);
                    break;
                case 3:
                System.out.println(days[2]);
                    break;
                case 4:
                System.out.println(days[3]);
                    break;
                case 5:
                System.err.println(days[4]);
                    break;
                case 6:
                System.out.println(days[5]);
                    break;
                case 7:
                System.out.println(days[6]);
                    break;
                    default:
                    System.out.println("Only 7 days in a week");
            }
                         

            scanner.close();
    }
}