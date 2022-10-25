import java.time.LocalDate;

public class Main {



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



    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviseIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviseIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.print("iOS");
        } else {
            System.out.print("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    private static void choosingVersion(int oS, int yearManufacture) {
        String osType = "";
        switch (oS) {
            case 0:
                osType = "iOS";
                break;
            case 1:
                osType = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", osType, getVersionByYear(yearManufacture));
    }

    private static String getVersionByYear(int year) {
        return year < LocalDate.now().getYear() ? "облегченную" : "";
    }


    public static int understandDistance(int a, int b) {
        b = 1;
        if (a < 20){
            b++;
            System.out.println("Потребуется " + b + " день");
        } else if (a >= 20 && a < 60) {
            b++;
            System.out.println("Потребуется " + b + " дня");
        } else {
            b++;
            System.out.println("Потребуется больше 3-х дней");
        }
        return 0;
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Потребуется дней: " + result);
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 2022;
        printIsLeapYear(year);// Переделка первого задаия

        System.out.println("Task 2");
        int clientOS = 1;

        recommendApplicationVersion(clientOS, year);// Переделка второго задания
        System.out.println();
        choosingVersion(clientOS, year);//Ещё одна переделка второго задания
        System.out.println();

        System.out.println("Task 3");
        int deliveryDistance = 95;
        int numberDays = 1;
        understandDistance(deliveryDistance, numberDays);

        calculateDeliveryDays(deliveryDistance);
    }


}