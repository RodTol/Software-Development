import java.util.Arrays;

public class MyStack implements Stack {

    private String[] data;

    MyStack (String[] input) {
        this.data = input;
    }

    @Override
    public String[] getValues() {
        return Arrays.copyOf(data, data.length);
    }

    @Override
    public void push(String value) {
        String[] newData = new String[data.length+1];
        if (!is_empty()) {
            System.arraycopy(data, 0, newData, 0, data.length);
        }
            newData[newData.length - 1] = value;
            this.data = newData;
    }

    @Override
    public String pop() {
        String last = data[data.length-1];
        String[] newData = new String[data.length-1];
        System.arraycopy(data, 0, newData, 0, data.length-1);
        this.data = newData;
        return last;
    }

    @Override
    public String top() {
        return data[data.length-1];
    }
}
