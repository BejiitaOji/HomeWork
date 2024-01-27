import java.util.HashMap;
import java.util.Map;

public class CustomHashMap {
    public HashMap<String, Integer> hashMap;

    public CustomHashMap(int initialCapacity) {
        this.hashMap = new HashMap<>(initialCapacity);
    }

    public CustomHashMap() {
        this.hashMap = new HashMap<>();
    }

    public CustomHashMap(String key, int value) {
        this.hashMap = new HashMap<>();
        hashMap.put(key, value);
    }


    public void put(String key, int value) throws CustomException {

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String targetKey = entry.getKey();
            Integer targetValue = entry.getValue();
            if(targetValue == value) {
                throw new CustomException("");
            }
            if(targetValue == value && targetKey.equals(key)) {
                throw new CustomException("eorweo");
            }
        }
        hashMap.put(key, value);
    }

    public int get(String key) {
        return hashMap.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append(", ");
        }
        if (!hashMap.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }
}