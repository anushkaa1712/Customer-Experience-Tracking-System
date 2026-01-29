package customer;

import java.util.Scanner;

public class CustomerLogin {

    public static Customer login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer ID: ");
        int id = sc.nextInt();

        System.out.print("Customer Name: ");
        String name = sc.next();

        System.out.print("Email: ");
        String email = sc.next();

        return new Customer(id, name, email);
    }
}
