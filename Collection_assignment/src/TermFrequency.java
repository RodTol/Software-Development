import java.util.*;

public class TermFrequency implements Map {

    Set<String> keysSet = new HashSet<String>() ;
    List<Integer> values = new ArrayList<Integer>();

    @Override
    public int size() {
        return keysSet.size();
    }

    @Override
    public boolean isEmpty() {
        if (keysSet == null) {
            return true;
        };
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        if (isEmpty()) {
            return false;
        }
        return keysSet.contains((String) key);
    }

    @Override
    public boolean containsValue(Object value) {
        if (isEmpty()) {
            return false;
        }
        return values.contains((Integer) value);
    }

    public int IdxOfKey(Object key) {
        for (int i = 0; i < keysSet.size(); i++) {
            if (keysSet.toArray()[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(Object key) {
        if (this.containsKey(key)) {
            return values.toArray()[IdxOfKey(key)];
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        if (this.containsKey(key)) {
            Object OldValue = values.toArray()[IdxOfKey(key)];
            values.toArray()[IdxOfKey(key)] = value;
            return OldValue;
        }
        keysSet.add((String) key);
        values.add((Integer) value);
        return null;
    }

    @Override
    public Object remove(Object key) {
        if (containsKey(key)) {
            Object OldValue =  get(key);
            values.remove((Integer) this.get(key));
            keysSet.remove((String) key);
            return OldValue;
        }
        return null;
    }

    @Override
    public void putAll(Map m) {
        keysSet.addAll(m.keySet());
        values.addAll(m.values());
    }

    @Override
    public void clear() {
        keysSet.clear();
        values.clear();
    }

    @Override
    public Set<String> keySet() {
        return keysSet;
    }

    @Override
    public List<Integer> values() {
        return values;
    }

    @Override
    public Set<String> entrySet() {
        Set<String> output = new HashSet<>();
        for (int i = 0; i<size(); i++) {
            output.add(keysSet.toArray()[i] + "=" + values.toArray()[i]);
        }
        return output;
    }
}
