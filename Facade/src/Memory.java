
public class Memory {
	void load(long position, char[] data) {
        System.out.println("Memory: Loading data at position " + position);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Memory Address " + (position + i) + ": " + data[i]);
        }
    }
}
