import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   public static int finduserindex(List<User> users,String userId)
    {
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).getUserId().equals(userId))
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        List<Transactions>transactions=new ArrayList<>();
        int mainchoice;
        int userindx=-1;
        int choice;
        Scanner sc=new Scanner(System.in);

        do{
           System.out.println("1.SignUp");
            System.out.println("2.SignIn");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            mainchoice=sc.nextInt();
            sc.nextLine();

            if (mainchoice==1)
            {
                String userId;
                String name;
                String emailId;
                String phoneNumber;
                double balance;
                System.out.println("Enter the UserId:");
                userId= sc.nextLine();
                int check=finduserindex(users,userId);
                if(check!=-1)
                {
                    System.out.println("UserId Already Exist..");
                    return;
                }
                else {
                    System.out.println("Enter the Name:");
                    name = sc.nextLine();
                    System.out.println("Enter the Emailid:");
                    emailId = sc.nextLine();
                    System.out.println("Enter the PhoneNumber:");
                    phoneNumber = sc.nextLine();
                    System.out.println("Enter the Initial Balance:");
                    balance = sc.nextDouble();
                    sc.nextLine();

                    User newuser = new User(userId, name, emailId, phoneNumber, balance);
                    users.add(newuser);
                    System.out.println("Signup successfull");
                }



            } else if (mainchoice==2) {
                String userId;
                System.out.println("Enter the UserId:");
                userId= sc.nextLine();
               userindx= finduserindex(users,userId);
                if (userindx!=-1) {

                    System.out.println("signin succesfull");
                    do {

                        System.out.println("1.User Profile");
                        System.out.println("2.Check Balance");
                        System.out.println("3.Make a Transaction");
                        System.out.println("4.Transaction History");
                        System.out.println("5.Logout");
                        choice = sc.nextInt();
                        sc.nextLine();
                        if (choice == 1) {


                        } else if (choice == 2) {

                        } else if (choice == 3) {

                        } else if (choice == 4) {

                        } else if (choice == 5) {
                            System.out.println("Loggingout....");
                        } else {
                            System.out.println("Invalid choice...");
                        }
                    }
                    while(choice!=5);
                }
                else {
                    System.out.println("no user found");
                }
                userindx=-1;


            } else if (mainchoice==3) {
                System.out.println("Exiting.....");

            }
            else
            {
                System.out.println("Invalid Choice...");
            }
        }
        while(mainchoice!=3);
    }


    }
