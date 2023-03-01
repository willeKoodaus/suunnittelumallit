import java.util.List;

public class ListContext {
    private List<String> list;
    private ListConverter converter;

    public ListContext(ListConverter converter) {
        this.list =  List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
        this.converter = converter;
    }

    public void setConverter(ListConverter converter) {
        this.converter = converter;
    }

    public String convertListToString() {
        return converter.listToString(list);
    }
}
