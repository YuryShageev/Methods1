import java.time.LocalDate;

public class Main {


    public static int checkLeapYear(int a) {
        for (int i = 2020; i < 2050; i++) {
            if (i % 4 == 0) {
                System.out.println("Високосный год " + i);
            } else {
                System.out.println("Невисокосный год " + i);
            }
        }
        return 0;
    }

    public static int findOutVersion(int a) {
        if (a == 1) {
            System.out.println("Ваша операционная система - Android");
        } else {
            System.out.println("Ваша операционная система - iOS");
        }
        return 0;
    }

    public static int findOutPhoneRelease(int a) {
        if (a >= 2015) {
            System.out.println("Ваша система современная");
        } else {
            System.out.println("Установите облегченную версию программы");
        }
        return 0;
    }

    public static void showResult(int a) {
        System.out.println();
    }

    public static int findDeliveryDistance(int b) {
        for (b = 0; b < 10; b++) {
        }
        return 0;
    }

    public static int understandDistance(int a, int b) {
        b = findDeliveryDistance(b);
        if (a < 20){
            System.out.println("Потребуется " + b + " день");
        } else if (a >= 20 || a < 60) {
            System.out.println("Потребуется " + b + " дня");
        } else {
            System.out.println("Потребуется больше 3-х дней");
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 0;
        checkLeapYear(year);

        int clientOS = 1;
        findOutVersion(clientOS);

        int phoneVersion = LocalDate.now().getYear();
        findOutPhoneRelease(phoneVersion);

        int deliveryDistance = 95;
        int numberDays = 0;
        understandDistance(deliveryDistance, numberDays);

    }


}