import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание №1");
        List<String> fruitList = new ArrayList<>(Arrays.asList("яблоко","груша","банан","мандарин", "персик",
                "киви","апельсин","яблоко","персик","яблоко"));

        Set<String> fruits = new TreeSet<>();
        Iterator<String> iter = fruitList.iterator();

        System.out.println("Количество повторяющихся слов в массиве " + fruitList + ":");
        while (iter.hasNext()){
            int repeat = 0;
            String fruit = iter.next();
            if(!(fruits.contains(fruit))){
                fruits.add(fruit);
                for (String f: fruitList) {
                   if(f.equals(fruit)){
                        repeat++;
                   }
                }
                System.out.println(fruit + " - " + repeat + ";");
            }
        }
        System.out.println("Уникальные слова: " + fruits);


        System.out.println("Задание №2");
        Phonebook pb = new Phonebook();

        pb.add("Иванов","89047658903");
        pb.add("Петров","89589059747");
        pb.add("Сидоров","89538956734");
        pb.add("Иванов","89770228940");
        pb.add("Иванов","89561462856");

        pb.get("Иванов");
        pb.get("Петров");
        pb.get("Сидоров");
        pb.get("Зайцев");








    }
}



