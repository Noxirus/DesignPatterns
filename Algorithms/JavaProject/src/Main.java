import HashMap.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(5);

        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");

        table.put(6, "A+");
        table.get(6);
        table.remove(6);

        System.out.println(table.get(6));
    }
}