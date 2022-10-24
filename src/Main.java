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
    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 0;
        checkLeapYear(year);
    }
}