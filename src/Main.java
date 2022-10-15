import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

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
        task9();


    }

    private static void task1() {
        System.out.println("Задание 1");
        int summa = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + summa;
            summa = summa + summa / 100 * 12;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");

        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10 ) {
            i++;
            System.out.print(i + " " );
        }
        System.out.println( " ");
        for (int q = 10; q > 0; q--) {
            System.out.print(q + " ");
        }
    }

    private static void task3() {
        System.out.println( " ");
        System.out.println("Задание 3");
        int peopleY = 12_000_000;
        int peopleY1000 = 12_000_000 / 1000;
        int peopleDeath = 8 * peopleY1000;
        int peopleBirthRate = 17 * peopleY1000;
        for (int i = 1; i < 11 ; i ++) {
            peopleY = peopleY - peopleDeath + peopleBirthRate;
            System.out.println("год " + i + " численность населения состовляет " + peopleY);
        }
    }

    private static void task4() {
        System.out.println("Задание 4 - 2");
        int summa = 15_000;
        int total = 0;
        int i = 0;
        while ( total < 12_000_000 ) {
            i++;
            total = total + summa;
            summa = summa + summa / 100 * 7;
            System.out.println("месяц " + i + " , сумма накоплений " + total + " рублей");
        }
    }

    private static void task5() {
        System.out.println("Задание 5 - 2");
        int summa = 15_000;
        int total = 0;
        int i = 0;
        while ( total < 12_000_000 ) {
            i++;
            total = total + summa;
            summa = summa + summa / 100 * 7;
            if ( i % 6 == 0 ) {
                System.out.println("месяц " + i + " , сумма накоплений " + total + " рублей");
        }
    }
    }

    private static void task6() {
        System.out.println("Задание 6 - 2");
        int summa = 15_000;
        int total = 0;
        for ( int i = 0; i <= 108; i ++ ) {
            total = total + summa;
            summa = summa + summa / 100 * 7;
            if (i % 6 == 0) {
            System.out.println("месяц" + i + " , сумма накоплений " + total + " рублей");
        }
    }
    }

    private static void task7() {
        System.out.println(" ");
        System.out.println("Задание 7 - 2");
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " - е число, Необходимо подготовить отчет!");
        }
    }

    private static void task8() {
        System.out.println(" ");
        System.out.println(" Задание 8 - 3");
        for ( int i = 0; i < 2122; i = i + 79 ) {
            System.out.println(i);
        }


    }

    private static void task9() {
        System.out.println("Задание 9 - 3");

        }

    }



