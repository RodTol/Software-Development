public class main {
    public static void main(String[] args) {
        TermFrequency table = new TermFrequency();
        table.put("ciao", 5);
        table.put("Balrog", 2);
        System.out.println(table.entrySet());

    }
}
