public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int salary = 15000;
        int total = 0;
        while (total < 2_459_000) {
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
            population = population+ population*fertility/1000 - population*mortality/1000;
            System.out.println("Год " + i + " Численность населения составляет "
                    + population);
        }
    }
    public static void task4(){
        int sum = 15_000;
        int i = 0;
        for ( i = 1; sum < 12_000_000 ; i ++){
            sum = sum + sum * 7 / 100;
            System.out.println("Месяц " + i + " сумма " + sum);
        }
    }
    public static void task5() {
        int sum = 15_000;
        int i = 0;
        for (i = 0; sum < 12000000; i ++) {
            sum = sum + sum * 7 / 100;
            if (i % 6 == 0)
            System.out.println("Месяц " + i + " сумма " + sum );
        }
    }
    public static void task6(){
      int sum = 15000;
      int i = 0;
       for (i = 1; i <= 108; i ++) {
           sum = sum + sum * 7 / 100;
           if (i % 6 == 0){
               System.out.println(sum);
       }
    }}

    public static void task7(){
        int friday = 5;
        for (int i = friday; i <= 31; i += 7) {

                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет»");
            }
        }

    public static void task8(){
        int currenYear = 2023;
        int currentYearMinus200 = currenYear - 200;
        int currentYearPlus100 = currenYear + 100;
        for (int i = 0; i < currentYearPlus100; i = i + 79) {
            if (currentYearMinus200 < i){
                System.out.println(i);
            }
        }
    }
}
