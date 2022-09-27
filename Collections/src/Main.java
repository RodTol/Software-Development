public class Main {
    public static void main(String[] args) {
        String[] input = {"Erica", "Rodolfo", "Luca", "Ario"};
        MyList list = new MyList(input);

        list.print();
        System.out.println("is_empty:  " + list.is_empty());
        System.out.println("size:  " + list.get_size());
        System.out.println("contains (Rodolfo):  " + list.contains("Rodolfo"));

        list.add("Giada");
        list.insertAt(2, "Gio");

        list.print();

        System.out.println("I will remove: " + list.get(3));
        list.remove(3);
        System.out.println("New index for Giada: " + list.indexOf("Giada"));

        list.print();

        System.out.println("-----------Stack time-----------");

        MyStack stack = new MyStack(new String[]{"Rodolfo"});

        stack.print();

        System.out.println("I insert Gio, Erica");

        stack.push("Gio");
        stack.push("Erica");

        stack.print();

        System.out.println("Top:  " + stack.top());
        System.out.println("I perform one pop");

        stack.pop();

        stack.print();

    }
}
