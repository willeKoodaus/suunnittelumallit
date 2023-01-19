
public class Main {

	public static void main(String[] args) {
		Jasper jasper = new Jasper(new AdidasClothingFactory());
		jasper.tellWhatIamWearing();
		System.out.println("Jasper graduated as an engineer.");
		jasper = new Jasper(new BossClothingFactory());
		jasper.tellWhatIamWearing();
		
		/*String factoryClassName = args[0];
        try {
            Class<?> factoryClass = Class.forName(factoryClassName);
            @SuppressWarnings("deprecation")
			Object factory = factoryClass.newInstance();
            Jasper jasper = new Jasper((ClothingAbstractFactory) factory);
            jasper.tellWhatIamWearing();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
	}
*/
	}}
