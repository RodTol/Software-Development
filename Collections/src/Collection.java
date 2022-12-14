public interface Collection {
    default boolean is_empty() {
        return getValues().length == 0;
    }
    default int get_size() {
        return getValues().length;
    }
    default boolean contains(String value) {
        for (String i : getValues()) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /*I have a lot of information from this method, so I can use it
    * to define all the others*/
    String[] getValues();

    default void print() {
        for (int i=0; i < get_size(); i++) {
            System.out.print(getValues()[i]+ " ");
        }
        System.out.println();
    }
}
