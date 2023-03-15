public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int salary = 15000;
        int total = 0;
        while (total < 2_459_000) {
            for (int i = 1; i < 100; i++) ;
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void task2() {
        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
            System.out.println();
            for (int i = 10; i >= 1; i = i - 1) {
                System.out.print(i + " ");
            }
        }

    }

