import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Put number from 0 to 8, when 0 is all tasks or 1-8 is number of task");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 0:
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();
                break;
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            default:
                System.out.println("You put a wrong number, try another number");
        }
    }

    public static void task1() {
        int dept = 0;
        int months = 0;
        int deposit = 15000;
        while (dept < 2459000) {
            months++;
            dept += deposit;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + dept + " рублей");
        }
    }

    public static void task2() {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        }
    public static void task3() {
        int population = 12000000;
        double birthRate = 0.0017;
        double deathRate = 0.0008;
        int years = 1;
        double growth = birthRate - deathRate;
        while (years <= 10) {
            population = (int) (population * (1 + growth));
            System.out.println("Год " + years + ", численность населения составляет " + population);
            years++;
        }
    }
    public static void task4() {
        double dept = 15000;
        double percent = 0.07;
        int months = 0;
        while (dept < 12000000) {
            months++;
            dept = (dept + 15000) * (1 +percent);
            System.out.println("Месяц " + months + ", сумма накоплений равна " + (int) dept + " рублей");
        }
    }
    public static void task5() {
        double dept = 15000;
        double percent = 0.07;
        int months = 0;
        while (dept < 12000000) {
            months++;
            dept = (dept + 15000) * (1 +percent);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + (int) dept + " рублей");
            }
        }
    }
    public static void task6() {
        double dept = 15000;
        double percent = 0.07;
        int months = 0;
        while (months <= 54) {
            months++;
            dept = (dept + 15000) * (1 +percent);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + (int) dept + " рублей");
            }
        }
    }
    public static void task7() {
        int friday = 4;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }
    public static void task8() {
        int years = 0;
        while (years < (2023 + 100)) {
            years += 79;
            if ((2023 - 200) <= years && (2023 + 100) >= years) {
                System.out.println(years);
            }
        }
    }
    }