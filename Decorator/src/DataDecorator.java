import java.util.List;

public abstract class DataDecorator implements IdataRakenne {
	private IdataRakenne data;
	public DataDecorator(IdataRakenne data) {
		this.data = data;
	}
	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		return data.getList();
	}

}
