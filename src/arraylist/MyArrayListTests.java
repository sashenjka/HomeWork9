package arraylist;

public class MyArrayListTests {
  public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();

    list.add("Oleksandra");
    list.add("Olesia");
    list.add("Inna");
    list.add("Ganna");
    list.add("Ivan");
    System.out.println("list.get(0) = " + list.get(0));
    System.out.println("list.get(1) = " + list.get(1));
    System.out.println("list.get(2) = " + list.get(2));

    System.out.println("list.size() = " + list.size());

    list.remove(1);
    System.out.println("list.get(0) = " + list.get(0));
    System.out.println("list.get(1) = " + list.get(1));
    System.out.println("list.get(2) = " + list.get(2));
    System.out.println("list.size() = " + list.size());

    list.clear();
    System.out.println("list.size() = " + list.size());
    System.out.println("list.get(0) = " + list.get(0));
  }
}
