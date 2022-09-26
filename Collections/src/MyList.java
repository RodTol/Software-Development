import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList implements List {

    /*Remember that string are immutable, so if we want
    * to modify my data string, we will need to create a new one
    * and copy it inside the data variable*/
    private String[] data = new String[0];

    MyList (String[] input) {
        this.data = input;
    }

    @Override
    public String[] getValues() {
        return Arrays.copyOf(data, data.length);
    }

    @Override
    public void add(String value) {
        String[] newData = new String[data.length+1];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length-1] = value;
        this.data = newData;
    }

    @Override
    public void insertAt(int index, String value) {
        if (index >= data.length) {
            System.out.println("Index out of bounds");
        } else {
            data[index] = value;
        }
    }
    @Override
    public void remove(int index) {
        String[] newData = new String[data.length-1];
        System.arraycopy(data, 0, newData, 0, index);
        System.arraycopy(data, index+1, newData, index, data.length-index-1);
        this.data = newData;
    }
}

