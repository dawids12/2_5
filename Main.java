
import java.util.Random;
class Main {
  public static void main(String[] args) {
   int[] tablica = new int[10];
    Random r = new Random();
    int los;
    for(int i = 0; i<tablica.length;i++)
      {
        los = r.ints().findFirst().getAsInt();
        tablica[i] = los;
      }
    
    double srednia = tablica[0];
    for(int i = 1; i<10;i++)
      {
        srednia = srednia + (tablica[i]);
      }
    System.out.print("Srednia wynosi: " + (srednia/10));
  }
}