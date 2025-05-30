import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        boolean flag = true;
        while (flag) {
            printMenu();
            Scanner scanner = new Scanner(System.in);

            String x = scanner.nextLine();
            System.out.println();

            switch (x) {
                case ("0"):
                    flag = false;
                    System.out.println("Выполнение программы завершено!");
                    break;

                case ("1"):
                    System.out.println("Введите название задачи: ");
                    String name = scanner.nextLine();

                    list.add(name);
                    printSpisok(list);
                    break;
                case ("2"):

                    printSpisok(list);
                    break;

                case ("3"):
                    System.out.println("Введите номер для удаления: ");
                    int number = scanner.nextInt();
                    list.remove(number - 1);
                    System.out.println("Удалено!");
                    printSpisok(list);
                    break;
                case ("4"):
                    System.out.println("Введите задачу для удаления: ");
                    String text = scanner.nextLine();
                    if (list.contains(text)) {

                        list.remove(text);
                        System.out.println("Удалено!");
                        printSpisok(list);
                        break;
                    } else {
                        System.out.println("Такого дела нет в списке");
                        printSpisok(list);
                    }
                case ("5"):
                    System.out.println("Введите ключевое слово для удаления");
                    String word = scanner.nextLine();
                    Iterator<String> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        String task = iterator.next();
                        if (task.contains(word)) {
                            iterator.remove();
                        }
                    }
                    printSpisok(list);
                    break;
                default:
                    System.out.println("Необходимо выбрать операцию из списка");
                    break;
            }
        }

    }

    public static void printMenu() {

        System.out.println("Выберите операцию: ");
        System.out.println();
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5. Удалить дело по ключевому слову");
        System.out.print("Ваш выбор: ");


    }

    public static void printSpisok(ArrayList<String> list) {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(list.get(i));
        }
        System.out.println();

    }
}