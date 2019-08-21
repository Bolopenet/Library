import java.io.*;
import java.util.Scanner;

public class Main {

            public static void main(String [] args) {
                try {
                    Scanner scan = new Scanner(new File("test.txt"));
                    Scanner input = new Scanner(System.in);


                    String inpUser;
                    String inpPass;


                    System.out.println("Welcome!");
                    System.out.println("\nEnter your username and password to login to your account.");
                    while(scan.hasNextLine()==true) {


                        String username = scan.nextLine();
                        String password = scan.nextLine();

                        System.out.println("Username: ");
                        inpUser = input.nextLine();

                        System.out.println("Password: ");
                        inpPass = input.nextLine();

                        Useraccount login = new Useraccount(username, password, inpUser, inpPass);
                        if (login.checkPassword())
                            System.out.println("You are loged in!");
                        else
                            System.out.println("The username and password you entered are incorrect.");
                       // break;
                    }
                } catch (Exception e) {
                    System.out.println("Excepton here");
                }



            }
            }

