package сom.gb.lesson_02.task_01;

import java.util.LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        printList(list1);
        System.out.println("Вставка элемента в середину листа...");
        list1.add(3, "6");
        printList(list1);

        System.out.println("Чтение элементов листа...");
        System.out.println("Первый элемент листа " + list1.getFirst() + " Последний элемент " + list1.getLast());

        System.out.println("Есть ли в списке элемент со значением 7 " + list1.contains("7"));

        int index;
        index = list1.indexOf("6");
        list1.set(index, "8");
        printList(list1);

        list1.addLast("6");
        printList(list1);

        System.out.println("Удаление элемента...");
        list1.remove("3");
        printList(list1);

    }

    public static void printList(LinkedList list) {
        System.out.println(list);
        System.out.println("количество элементов " + list.size());
    }
}
