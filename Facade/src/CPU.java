
public class CPU {
	
	void freeze() {
        System.out.println("CPU: Freezing");
    }

    void jump(long position) {
        System.out.println("CPU: Jumping to position " + position);
    }

    void execute() {
        System.out.println("CPU: Executing");
    }

}
