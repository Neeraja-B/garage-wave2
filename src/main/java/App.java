 public Class App{
  public boolean isPalindrome(String input){
     if (input.equals(reverse(input))){
        return true:
     }
     else{ 
        return false;
   }
  }
 private String reverse(String input) {
  String rev = "";
  for(int i=input.lenght()-1;i>=0;i--){
       rev = rev+input.charAt(i);
  }
  retutn rev;
 }
