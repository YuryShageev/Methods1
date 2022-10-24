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

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean isLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " Високосный");
        } else {
            System.out.println(year + " Невисокосный");
        }
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

    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviseIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviseIsOld) {
            System.out.println("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
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
        int year = 2019;
        checkLeapYear(year);
        printIsLeapYear(year);// Переделка первого задаия

        System.out.println("Task 2");
        int clientOS = 1;
        findOutVersion(clientOS);

        int phoneVersion = LocalDate.now().getYear();
        findOutPhoneRelease(phoneVersion);

        recommendApplicationVersion(clientOS, year);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        int numberDays = 0;
        understandDistance(deliveryDistance, numberDays);

    }


}