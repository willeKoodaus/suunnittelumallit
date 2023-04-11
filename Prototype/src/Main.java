public class Main {
    public static void main(String[] args) {
        try {
            Kello alkuperainen = new Kello(12, 0, 0);
            Kello matalaKlooni = alkuperainen.clone();
            Kello syvaKlooni = alkuperainen.deepClone();

            System.out.println("Alkuperäinen: " + alkuperainen);
            System.out.println("Matala klooni: " + matalaKlooni);
            System.out.println("Syvä klooni: " + syvaKlooni);

            alkuperainen.setAika(14, 30, 0);

            System.out.println("\nMuutetaan alkuperäisen kellon aikaa...");
            System.out.println("Alkuperäinen: " + alkuperainen);
            System.out.println("Matala klooni: " + matalaKlooni);
            System.out.println("Syvä klooni: " + syvaKlooni);    
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
}


