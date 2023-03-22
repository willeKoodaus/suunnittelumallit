import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] arguments) {
		List<Image> photos = new ArrayList<>();

		photos.add(new ProxyImage("HiRes_10MB_Photo1"));
		photos.add(new ProxyImage("HiRes_10MB_Photo2"));
		photos.add(new ProxyImage("kissa.jpg"));
		photos.add(new ProxyImage("koira.jpg"));

    	System.out.println("Tietojen tulostus");
    	for (Image image : photos) {
    		image.showData();
    	}
    	
    	System.out.println("\nKuvien selaus:");
    	for (Image image : photos) {
    		image.displayImage();
    	}
    	
    	System.out.println("\nSelataan uudelleen, ei tarvitse ladata:");
    	for (Image image : photos) {
    		image.displayImage();
    	}
    }
}
