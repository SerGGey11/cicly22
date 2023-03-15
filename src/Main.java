public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
    public static void task3(){
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i ++){
            population = population+ population*17/1000 - mortality*8/1000;
            System.out.println("Год " + i + " Численность населения составляет "
                    + population);
        }
    }
    public static void task4(){
        int sum = 15_000;
        int many = 0;
        int i = 0;
        for ( i = 1; i < 12_000_000 ; i +=  6){
            sum = sum + sum * 7 / 100;
            sum = many + i / 1050;
            System.out.println("Месяц " + sum + " сумма " + i);
        }
    }
    }

