//find the largest among 3 numb

import java.lang.*;

class Largest {
 public static void main(String[] args) {
  int a = 5, b = 10, c = 15;
  if (a >= b && a >= c) {
   System.out.println("A is Largest Number");
  } else if (b >= c) {
   System.out.println("B is Largest Number");
  } else {
   System.out.println("C is Largest Number");
  }
 }
}
