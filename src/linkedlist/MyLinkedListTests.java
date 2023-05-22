package linkedlist;

public class MyLinkedListTests {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Milk");
        list.add("Water");
        list.add("Juice");


        System.out.println("list = " + list.size());

        System.out.println("list get(0) = " + list.get(0));
        System.out.println("list get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.remove(1) = " + list.remove(1));
        list.clear();
        System.out.println("list size after clear = " + list.size());

    }
}

