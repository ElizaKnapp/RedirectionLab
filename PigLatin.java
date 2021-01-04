import java.util.*;

public class PigLatin {
  public static void main(String[] args) {

  }

  public static String pigLatinSimple(String s) {
    char first = s.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
      return s + "hay";
    }
    else {
      return s.substring(1) + first + "ay";
    }
  }

}
