import java.util.ArrayList;
import java.util.List;

public class DataRakenne implements IdataRakenne {
	private List<String> dataLista = new ArrayList<String>();
	public DataRakenne() {
		this.dataLista.add("jee");
		this.dataLista.add("juu");
		this.dataLista.add("jaa");
	}
	@Override
	public List<String> getList() {
		return this.dataLista;
	}

}
