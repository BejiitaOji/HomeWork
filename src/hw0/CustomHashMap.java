package hw0;

import java.util.HashMap;
import java.util.Map;

public class CustomHashMap<K, V> {
    private final HashMap<K, V> map;

    public CustomHashMap(int initialCapacity) {
        this.map = new HashMap<>(initialCapacity);
    }

    public CustomHashMap() {
        this.map = new HashMap<>();
    }

    public CustomHashMap(K... keysAndValues) {
        this.map = new HashMap<>();
        if (keysAndValues != null) {
            for (int i = 0; i < keysAndValues.length; i += 2) {
                map.put(keysAndValues[i], (V) keysAndValues[i + 1]);
            }
        }

    }

    public void put(K key, V value) {
        try {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getKey().equals(key) && entry.getValue() == value) {
                    throw new CustomUncheckedException("this pair is already in used");
                } else if (entry.getKey().equals(key)) {
                    map.put(key, value);
                    throw new CustomCheckedException("this key already in used");
                }
            }
        } catch (CustomUncheckedException e) {
            System.out.println("An unchecked exception occurred: " + e.getMessage());
        } catch (CustomCheckedException e) {
            System.out.println("A checked exception occurred: " + e.getMessage());
        }
    }


    public V get(K key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append(", ");
        }
        if (!map.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }
}