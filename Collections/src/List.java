public interface List extends Collection {
    void add(String string);
    String get();
    void insertAt(int index, String string);
    void remove(int index);
    int indexOf(String string);
}
