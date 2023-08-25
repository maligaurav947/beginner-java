import java.lang.*;
import java.util.Scanner;

class Single {
 Scanner sc = new Scanner(System.in);
 String name;

 public void Get() {
  System.out.print("Enter The Name:");
  name = sc.next();
 }

 public void Display() {
  System.out.println("The Name You Entered:" + name);
 }
}

public class SingleInheritance {
 public static void main(String[] args) {
  Single s = new Single();
  s.Get();
  s.Display();
 }
}