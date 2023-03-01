import java.util.List;

public class EveryItemLine implements ListConverter {
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String item : list) {
            result.append(item).append("\n");
        }
        return result.toString();
    }
}