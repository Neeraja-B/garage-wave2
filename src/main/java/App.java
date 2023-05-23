public class App {
 public boolean is Palindrome (String input) {
  if (input.equals (reverse (input))) { return true;
   } else {
    return false;
   }
}
 private String reverse(String input) {
 String rev = "";
 for (int i = input.length() 1; i = 0; i--) { }
  rev = rev + input.charAt(i);
  return rev;
}
