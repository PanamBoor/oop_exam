import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m;
        double h;
        String name;
        Scanner scanner = new Scanner(System.in);
        ArrayList people = new ArrayList();
        System.out.println("Меню:");
        boolean quit = true;
        while (quit) {
            System.out.println("1.Новый расчет");
            System.out.println("2.История расчетов");
            System.out.println("3.Выход");
            System.out.print("Сделайте выбор: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите имя");
                    name = scanner.next();
                    System.out.print("Введите вес, в кг: ");
                    m = scanner.nextInt();

                    System.out.print("Введите рост , в см: ");
                    h = scanner.nextDouble();

                    h = h / 100;

                    double I = m / (h * h);
                    System.out.println("Индекс массы тела : " + I);
                    double norm;
                    if (I <= 16) {
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tВыраженный дефицит массы тела");
                        norm = m - (18.5*(h*h));
                        System.out.println("Выраженный дефицит массы тела");
                        System.out.println("Вам нужно набрать " + norm + " кг. до нормального веса");

                    } else if (I > 16 && I < 18.5) {
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tНедостаточная (дефицит) масса тела");
                        norm = m - (18.5*(h*h));
                        System.out.println("Недостаточная (дефицит) масса тела");
                        System.out.println("Вам нужно набрать " + norm + " кг. до нормального веса");
                    } else if (I >= 18.5 && I < 25) {
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tНорма");
                        System.out.println("Норма");

                    } else if (I >= 25 && I < 30) {
                        System.out.println("Избыточная масса тела(предожирение)");
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tИзбыточная масса тела(предожирение)");
                        norm = m - (24*(h*h));
                        System.out.println("Вам нужно скинуть " + norm + " кг. до нормального веса");
                    } else if (I >= 30 && I < 35) {
                        System.out.println("Ожирение");
                        norm = m - (24*(h*h));
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tОжирение");
                        System.out.println("Вам нужно скинуть " + norm + " кг. до нормального веса");
                    } else if (I >= 35 && I < 40) {
                        norm = m - (24*(h*h));
                        System.out.println("Ожирение резкое");
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tОжирение резкое");
                        System.out.println("Вам нужно скинуть " + norm + " кг. до нормального веса");
                    } else if (I >= 40) {
                        System.out.println("Очень резкое ожирение");
                        norm = m - (24*(h*h));
                        people.add("Имя : "+ name + "\tВес: " + m + "\tРост" + h + "\tИМТ" + I + "\tОчень резкое ожирение");
                        System.out.println("Вам нужно скинуть " + norm + " кг. до нормального веса");
                    }
                    System.out.println();
                    break;


                case 2:
                    Object[] peopleArray = people.toArray();
                    for (Object person : peopleArray) {

                        System.out.println(person);
                    }
                    System.out.println();
                    break;
                case 3:
                    quit = false;
                    break;
                default:
                    System.out.println("Неправильный ввод");
                    System.out.println();
            }
        }
    }
}
