public class Main {
    public static void main(String[] args) {
        StackYigin stack = new StackYigin(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Cikan:"+stack.pop());
    }
}