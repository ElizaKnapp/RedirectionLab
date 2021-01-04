import java.util.*;

public class MakeStars {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    while (in.hasNextLine()) {
      Scanner line = new Scanner(in.nextLine());
      while (line.hasNext()) {
        int j = line.next().length();
        for (int i = 0; i < j; i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
