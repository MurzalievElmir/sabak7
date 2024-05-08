import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//
//  Scanner scanner=new Scanner(System.in);
// // int on=scanner.nextInt();
////        if (on > 0) {
////            System.out.println("positive");
////        } else {
////            System.out.println("negative");
////        }
//
//        int ters= scanner.nextInt();
//        if (ters >= 7){
//            System.out.println("positive");
//        }else {
//            System.out.println("negative");
//        }

        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s){
            case "USD":
                System.out.println("USD=89.29");
                break;
            case "EUR":
                System.out.println("EUR=97.07");
                break;
            case "RUB":
                System.out.println("RUB1.01");
                break;
            case "LIRA":
                System.out.println("LIRA2.96");
                break;
            default:
                System.out.println("мындай курс жок");

        }























    }
}