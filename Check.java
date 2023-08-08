//Check if Number is a Alphabet , Character , Special Symbol

import java.lang.*;

class Check {
 public static void main(String[] args) {
  char c = '0';
  if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
   System.out.println("Alphabet");
  } else if (c >= '0' && c <= '9') {
   System.out.println("Number");
  } else {
   System.out.println("Special Symbol");
  }
 }
}
