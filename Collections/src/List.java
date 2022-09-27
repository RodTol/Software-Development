public interface List extends Collection {
    void add(String string);
    void insertAt(int index, String string);
    void remove(int index);
    default String get(int index) {
        return getValues()[index];
    }
    default int indexOf(String value) {
        for (int i=0; i < getValues().length ; i++) {
            if (getValues()[i].equals(value)) {
                return i;
            }
        }
        System.out.println("Not Found");
        return getValues().length;
    }
}
