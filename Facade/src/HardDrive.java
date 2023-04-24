
public class HardDrive {
	char[] read(long lba, int size) {
        System.out.println("HardDrive: Reading " + size + " bytes from LBA " + lba);
        // Dummy data for simulation
        return new char[] {'H', 'e', 'l', 'l', 'o', '!', ' ', 'B', 'o', 'o', 't', 'i', 'n', 'g', '.', '.'};
    }
}
