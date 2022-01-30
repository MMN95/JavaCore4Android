import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] nums = {1,2,3};
        String[] words = {"один","два","кот","телевизор"};

//      Задание №1
        elementSwap(nums,0,2);
        elementSwap(words,1,3);

//      Задание №2
        System.out.println(toArrayList(nums));
        System.out.println(toArrayList(words));

//      Задание №3
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple a = new Apple();
        Orange o = new Orange();

        appleBox.addFruit(a);
        appleBox.addFruit(a);
        orangeBox.addFruit(o);
        orangeBox.addFruit(o);

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравнение коробок: " + appleBox.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<>();
        System.out.println("Пересыпаем яблоки из одной коробки в другую: ");
        appleBox.pourFruits(appleBox2);
        System.out.println("Вес 1-й коробки: " + appleBox.getWeight());
        System.out.println("Вес 2-й коробки: " + appleBox2.getWeight());
    }

    public static <T> void elementSwap(T[] arr, int a, int b) {
        T t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}

