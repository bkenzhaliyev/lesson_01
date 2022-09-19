package сom.gb.lesson_02.task_02;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        // добавление элементов
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");

      printList(aList);

        System.out.println("Значение элемента 3 = " + aList.get(2));

        System.out.println("Есть ли в списке элемент со значением 7 " + aList.contains("7"));

        aList.remove("4"); // Удаление по значению элемента
        printList(aList);

        aList.remove(1); // Удаление по индексу
        printList(aList);

        aList.add(0, "0"); // Добавление элемента со сдвигом
        printList(aList);

        aList.set(2, "4"); // Присвоение значения по индексу
        printList(aList);
    }

    // Метод печати
    public static void printList(ArrayList<String> list){
        for (String element:list
             ) {
            System.out.printf(element);
        }
        System.out.println();
        System.out.printf("Количество элементо списка = " + list.size() + "\n");
    }
}
