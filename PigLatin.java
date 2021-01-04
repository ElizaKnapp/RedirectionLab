import java.util.*;

public class PigLatin {
  public static void main(String[] args) {
    //quick test pl 2
    System.out.println(pigLatin("apple"));
    System.out.println(pigLatin("banana"));
    System.out.println(pigLatin("check"));

  }

  public static String pigLatinSimple(String s) {
    char first = s.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u')
      return s + "hay";
    else return s.substring(1) + first + "ay";
  }

  public static String pigLatin(String s) {
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

}
