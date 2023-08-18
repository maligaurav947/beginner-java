
//Mutilevel Inheritance

import java.lang.*;
import java.util.Scanner;

class Bank {
  double bal = 0;
  String name;
  String mail;
  long num;
  Scanner sc = new Scanner(System.in);

  void create() {
    System.out.println("\n****Please Enter Details To Open Bank Account****\n");
    System.out.print("Name:");
    name = sc.next();
    System.out.print("Email-Id: ");
    mail = sc.next();
    System.out.print("Contact Number: ");
    num = sc.nextLong();
    System.out.println();
    System.out.println("Details\n\nName:" + name + "\nEmail-Id:" + mail + "\nContact Number: " + num);
    System.out.println();
    System.out.println("Your Account Was Create Successfully");
  }

  void debit(double amt) {
    if (amt <= 0) {
      bal = bal - amt;
    } else
      System.out.println("You Don't Have Balance");
  }

  void creatit(double amt) {
    bal = bal + amt;
  }

  double bal() {
    return bal;
  }
}

class Operation extends Bank {
  double amt;

  public void transaction() {
    System.out.println("Choose The Action");
    System.out.print("1.Debit\n2.Cretit\n3.Balance Check");
    int op = sc.nextInt();
    switch (op) {

      case 1:
        System.out.println("Enter The Amount To Debit: ");
        amt = sc.nextDouble();
        debit(amt);
        System.out.println("Your Currnet Balnce is:" + bal());
        break;

      case 2:
        System.out.println("Enter The Amount To Cretit: ");
        amt = sc.nextDouble();
        creatit(amt);
        System.out.println("Your Currnet Balnce is:" + bal());
        break;

      case 3:
        System.out.println("Your Currnet Balnce is:" + bal());

      default:
        System.out.println("Please Choose List");
    }
  }
}

class Customer extends Operation {
  void Show() {
    System.out.print("Choose From 0/1:");
    int i = sc.nextInt();
    if (i == 1)
      transaction();
    else
      create();
  }
}

public class BankClass {

  public static void main(String[] args) {
    Customer c = new Customer();
    c.Show();
  }

}
