import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaasyValvonta extends DataDecorator{
	private String salasana = "joo";
	private List<String> paasyKielletty = new ArrayList<String>();
	public PaasyValvonta(IdataRakenne data) {
		super(data);
		paasyKielletty.add("vaara");
		paasyKielletty.add("Salasana");
	}
	public List<String> getList(){
		return paasyValvonta();
	}
	
	public List<String> paasyValvonta() {
		Scanner scanner = new Scanner(System.in);
		String annettuSalasana;
		System.out.println("Anna salasana");
		annettuSalasana = scanner.nextLine();
		if(this.salasana.contains(annettuSalasana)) {
			return super.getList();
		}else {
			return paasyKielletty;
		}
	}

}
