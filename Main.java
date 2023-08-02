import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        System.out.println("mời bạn nhập quãng đường:");
        do {
            n = Double.parseDouble(scanner.nextLine());
            if (n<0){
                System.out.println("bạn nhập sai quãng đường! vui lòng nhập lại:");
            }
        }while ( n<0);


        Bus bus = new Bus();
        Train train = new Train();
        Plan plan = new Plan();

        bus.print();
        System.out.println("thời gian xe bus đến nơi là : "+bus.time(n)+" giờ");
        System.out.println("------------------------------------------");
        train.print();
        System.out.println("thời gian tàu hỏa đến nơi là : "+train.time(n)+" giờ");
        System.out.println("------------------------------------------");
        plan.print();
        System.out.println("thời gian máy bay đến nơi là : "+plan.time(n)+" giờ");
    }
}