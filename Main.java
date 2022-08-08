import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter your first number");
        int inputnumber = sc.nextInt();


        System.out.println("please Enter your second number");
        int inputnumber2 = sc.nextInt();

        System.out.println("please chose your operation " +
                "1-(+)" +
                "2-(-)" +
                "3-(/)" +
                "4-(*)" +
                "5-(%)");
        String operation = sc.next();
        int result;
        switch (operation) {

            case "1":
                result = inputnumber + inputnumber2;
                System.out.println(inputnumber + "+" + inputnumber2 + "=" + result);
                break;

            case "2":
                result = inputnumber - inputnumber2;
                System.out.println(inputnumber + "-" + inputnumber2 + "=" + result);
                break;

            case "3":
                result = inputnumber / inputnumber2;
                System.out.println(inputnumber + "/" + inputnumber2 + "=" + result);
                break;
            case "4":
                result = inputnumber * inputnumber2;
                System.out.println(inputnumber + "*" + inputnumber2 + "=" + result);
                break;

            case "5":
                result = inputnumber % inputnumber2;
                System.out.println(inputnumber + "%" + inputnumber2 + "=" + result);
                break;

        }
    }
}