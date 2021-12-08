import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeMap;
import vsu.ru.silnov.RangeSet;

import java.util.Scanner;

public class GUI {

    public void demoInterface(RangeMap<String, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(key, from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(key2);
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(key3)){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoInterface(rangeMap);
    }

    public void print(){
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить");
        System.out.println("2. Удалить");
        System.out.println("3. Поиск");
        System.out.println("4. Распечатать коллекцию");
        System.out.println("5. Выйти");
    }

    public void demoSet(RangeSet<Range> rangeSet){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();

        switch (line){
            case "1" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
                rangeSet.add(range);
            }

            case "2" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
                rangeSet.remove(range);
            }

            case "3" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
            }

            case "4" -> System.out.println(rangeSet.toString());

            case "5" -> System.exit(0);
        }
        demoSet(rangeSet);
    }
}
