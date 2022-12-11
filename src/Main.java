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
        //task9();
        //task10();
    }

    public static void task1() {
        System.out.println("Задача 1. С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.");
        System.out.println("Решение: ");
        float salary = 15000;
        float total = 0;
        int i = 1;
        while (total <= 2459000) {
            total += total * 0.01 + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2. Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while. На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.");
        System.out.println("Решение: ");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3. В стране Y население равно 12 миллионов человек. Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.");
        System.out.println("Решение: ");
        int totalPeople = 12000000;
        int bornPeopleAtThousend = 17;
        int deadPeopleAtThousend = 8;
        int year = 1;
        while (year <= 10) {
            totalPeople += totalPeople / 1000 * bornPeopleAtThousend - totalPeople / 1000 * deadPeopleAtThousend;
            System.out.println("Год " + year + " численность населения составляет " + totalPeople + " человек");
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4. Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.\nВычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.");
        System.out.println("Решение: ");
        int total = 15000;
        float bankPercent = 0.07F;
        int target = 12000000;
        int i = 1;
        while (total <= target) {
            total += total * bankPercent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            i++;
        }
        System.out.println("Денежные средства в размере " + target + " рублей будут накоплены через " + (i - 1) + " месяцев.");
    }

    public static void task5() {
        System.out.println("Задача 5. Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.");
        System.out.println("Решение: ");
        int total = 15000;
        float bankPercent = 0.07F;
        int target = 12000000;
        int i = 1;
        while (total <= target) {
            total += total * bankPercent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
            i++;
        }
        System.out.println("Денежные средства в размере " + target + " рублей будут накоплены через " + (i - 1) + " месяцев.");
    }

    public static void task6() {
        System.out.println("Задача 6. Сумма вклада 15000 рублей, банковский процент 7% в месяц, срок вклада 9 лет. Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.");
        System.out.println("Решение: ");
        int total = 15000;
        float bankPercent = 0.07F;
        int totalStorageTimeYears = 9;
        int month = 1;
        while (month <= totalStorageTimeYears * 12) {
            total += total * bankPercent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        System.out.println("За " + totalStorageTimeYears + " лет сумма накоплений равна " + total + " рублей.");
    }

    public static void task7() {
        System.out.println("Задача 7. Написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.");
        System.out.println("Решение: ");
        int dayNumberIsFirstFriday = 4;
        int daysInMonth = 31;
        int day = 1;
        while (day <= daysInMonth) {
            if (day == dayNumberIsFirstFriday || day== (dayNumberIsFirstFriday + 7*(day/7))) //(day/7) - для данной даты вычисляется порядковый номер недели в месяце
            {
                System.out.println("Сегодня пятница " + day + "-ое число. Необходимо подготовить отчет.");
            }
            day++;
        }
    }
    public static void task8() {
        System.out.println("Задача 8. В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета (пролетает каждый 79-й год), а также следующий год ее появления (ближайшие 100 лет).");
        System.out.println("Решение: ");
        int yearNow = 2022;
        int startYear = yearNow-200;
        int lastYear = yearNow+100;
        int cometPeriod = 79;
        int year = 0;
        System.out.println("В период времени с " + startYear + " года, до "+lastYear+" года. Комета появляется в:");
        while (year <= lastYear) {
            if (year >=  startYear)
            {
                System.out.println( year + "-ом году.");
            }
            year+= cometPeriod;
        }
    }
}