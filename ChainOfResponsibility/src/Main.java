import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) {
Lahiesimies manager = new Lahiesimies();
YksikonPaallikko director = new YksikonPaallikko();
Toimitusjohtaja ceo = new Toimitusjohtaja();

manager.setSuccessor(director);
director.setSuccessor(ceo);
// Press Ctrl+C to end.
try {
while (true) {
System.out.println("Paljon haluaisit, etta uusi palkkasi olisi.");System.out.print(">");
double palkka = Double.parseDouble(new BufferedReader(new
InputStreamReader(System.in)).readLine());
manager.handle(palkka);
}
} catch(Exception e) {
System.exit(1);
}
}
}
