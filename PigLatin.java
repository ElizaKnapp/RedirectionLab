import java.util.*;

public class PigLatin {
  public static void main(String[] args) {
    /*
    //quick test pl 3
    System.out.println(pigLatinBest("apple"));
    System.out.println(pigLatinBest("banana"));
    System.out.println(pigLatinBest("check"));
    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("apple%"));
    */
    Scanner in = new Scanner (System.in);
    while (in.hasNextLine()) {
      Scanner line = new Scanner(in.nextLine());
      while (line.hasNext()) {
        System.out.print(pigLatinBest(line.next()));
        System.out.print(" "); //how do you get rid of the last space?
      }
      System.out.println();
    }



  }

  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    char first = s.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u')
      return s + "hay";
    else return s.substring(1) + first + "ay";
  }

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    if (s.length() == 1) return pigLatinSimple(s);
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                          "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                          "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                          "tr", "tw", "wh", "wr"};
    String first2 = s.substring(0, 2);
    boolean containsDi = false;
    for (int i = 0; i < digraphs.length; i++)
      if (first2.equals(digraphs[i])) containsDi = true;
    if (containsDi) return s.substring(2) + first2 + "ay";
    else return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    char first = s.charAt(0);
    char last = s.charAt(s.length() - 1);
    if (!((65 <= last && last <= 90) || (97 <= last && last <= 122) || (48 <= last && last <= 57)) && s.length() != 1) {
      char save = last;
      s = s.substring(0, s.length() - 1);
      return pigLatin(s) + save;
    }

    if (!((65 <= first && first <= 90) || (97 <= first && first <= 122)))
      return s;
    else return pigLatin(s);
  }

}
