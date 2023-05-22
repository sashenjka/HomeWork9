package stack;

public class MyStackTests {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Menu is:");
        stack.push("Ice cream");
        stack.push("Juice");
        stack.push("Salad");
        stack.push("Sushi");

        System.out.println("stack size = " + stack.size());

        System.out.println("stack.remove(2) = " + stack.remove(2));
        System.out.println("stack size = " + stack.size());

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack size = " + stack.size());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack size = " + stack.size());

        stack.clear();
        System.out.println("stack size = " + stack.size());

    }
}

