
public class ComputerFacade {
	private static final long kBootAddress = 0x000000;
    private static final long kBootSector = 0x0000;
    private static final int kSectorSize = 16;

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }

}
