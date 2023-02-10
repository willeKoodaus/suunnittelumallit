
public class Main {

	public static void main(String[] args) {
		IdataRakenne datarakenne = new PaasyValvonta(new DataRakenne());
		IdataRakenne datarakenne2 = new DataRakenne();
		System.out.println(datarakenne.getList());
		System.out.println(datarakenne.getList());
		System.out.println(datarakenne2.getList());
	}

}
