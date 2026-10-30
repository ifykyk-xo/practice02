import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // Завдання 21
        int counter = 5;
        System.out.println(counter++);
        // Тут выводится 5 потому что в первом он берет за основу просто counter
        System.out.println(counter);
        // А тут выводится 6 потому что он добавляет единицу от наших плюсиков
        System.out.println("   ");


        // Завдання 22
        counter = 5;
        System.out.println(++counter);
        // Тут сразу выводится 6 скорее из-за того что плюсики стоят сразу перед counter и он их сразу добавляет к 5


        // Завдання 23
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println("Очікуваний результат:");
        System.out.println("Середній бал: " + (grade1 + grade2 + grade3) / 3.0);

        // Завдання 24
        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double  kelvin = (celsius + 273.15);
        System.out.println(celsius + "°C = " + fahrenheit + "°F" );
        System.out.println(celsius + "°C = " + kelvin + " K");

        // Завдання 25
        int userAge = 17;
        boolean isAdult  = userAge >= 18;
        System.out.println("Вік: " + userAge);
        System.out.println("Чи є повнолітнім: " + isAdult);


        // Завдання 26
        int x = 15;
        int y = 20;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >y);
        System.out.println("   ");


        // Завдання 27
        int speed = 75;
        boolean isSafeSpeed = (speed < 20) && (speed <= 80);
        System.out.println(isSafeSpeed);


        // Завдання 28
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ".");
        System.out.println("Право на безкоштовний проїзд: " + hasFreePass);


        // Завдання 29
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можно увійти: " + canEnter);
        System.out.println("   ");


        // Завдання 30
        // Результат для числа 30
        int number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println(isDivisibleByBoth);
        // Результат для числа 25
        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println(isDivisibleByBoth);
        System.out.println("   ");


        // Завдання 31
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println(canLogin);
        System.out.println("   ");


        // Завдання 32
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);
        System.out.println("   ");


        // Завдання 33
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Катети: " + a + " та " + b + ".");
        System.out.println("Гіпотенуза: " + c);
        System.out.println("   ");


        // Завдання 34
        double radius = 5.0;
        double length = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус " + radius);
        System.out.println("Довжина кола: " + length);
        System.out.println("Площа круга: " + area);


        // Завдання 35
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double dif = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println("Перепад температури: " + dif);
        System.out.println("Максимальна температура: " + maxTemp);
        System.out.println("Мінімальна температура: " + minTemp);


        // Завдання 36
        double num = 5.67;
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println("   ");
        // Теперь з від'ємними
        double negNum = -5.67;
        System.out.println(Math.round(negNum));
        System.out.println(Math.ceil(negNum));
        System.out.println(Math.floor(negNum));
        System.out.println("   ");


        // Завдання 37
        double a2 = 1.0;
        double b2 = -7.0;
        double c2 = 10.0;
        double d2 = Math.pow(b2, 2) - 4 * a2 * c2;
        double x1 = (-b2 + Math.sqrt(d2)) / (2 * a2);
        double x2 = (-b2 - Math.sqrt(d2)) / (2 * a2);
        System.out.println("Дискримінант D = " + d2);
        System.out.println("Корінь х1 = " + x1);
        System.out.println("Корінь х2 = " + x2);
        System.out.println("   ");



        // Завдання 38
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);
        System.out.println("   ");
        // Лудка ваще



        // Завдання 39
        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: " + randomTemp);
        System.out.println("   ");
        // Лудка но еще потужнее



        // Завдання 40
        double p = 10000.0;
        double r = 12.0;
        double t = 3.0;
        double s = p * Math.pow(1 + r / 100, t);
        s = Math.round(s * 100) / 100.0;
        double profit = s - p;
        profit = Math.round(profit * 100) / 100.0;
        System.out.println("+-----------------------------------+");
        System.out.println("|      ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР       |");
        System.out.println("+-----------------------------------+");
        System.out.print("Початкова сума: " + p);
        System.out.println(" грн");
        System.out.print("Термін: " + t);
        System.out.print(" роки під " + r);
        System.out.println("% річних");
        System.out.print("Підсумкова сума: " + s);
        System.out.println(" грн");
        System.out.print("Чистий прибуток: " + profit);
        System.out.println(" грн");
        System.out.println("+-----------------------------------+");



    }
}