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
                           System.out.println(users.get(userindx).toString());

                        } else if (choice == 2) {
                            System.out.println(users.get(userindx).getBalance());

                        } else if (choice == 3) {
                            String receiverId;
                            double amount;
                            System.out.println("Enter the Receivers UserId:");
                            receiverId= sc.nextLine();
                            int recId=finduserindex(users,receiverId);
                            if(recId==-1)
                            {
                                System.out.println("UserId not Found..");

                            }
                            else {

                                System.out.println("Enter amount to send:");
                                amount=sc.nextInt();
                                sc.nextLine();
                                if (amount>users.get(userindx).getBalance())
                                {
                                    System.out.println("Insufficient Balance!!");
                                }
                                else
                                {
                                    String tid="TXN"+(transactions.size()+1);
                                    String method;
                                    String senderId=users.get(userindx).getUserId();
                                    System.out.println("enter the payemnt type:");
                                    method=sc.nextLine();
                                    users.get(userindx).deductBalance(amount);
                                    users.get(recId).addBalance(amount);
                                    System.out.println("Transaction Successfull ");
                                    Transactions newtransaction=new Transactions(tid,senderId,receiverId,method,amount);
                                    transactions.add(newtransaction);
                                    System.out.println(newtransaction);
                                }

                            }

                        } else if (choice == 4) {
                            String currentuserId = users.get(userindx).getUserId();
                            boolean found=false;
                            for (int i=0;i<transactions.size();i++) {
                                Transactions t=transactions.get(i);
                                if (t.getSenderId().equals(currentuserId)||t.getReceiverId().equals(currentuserId)) {
                                    System.out.println(t);

                                   found=true;
                                }

                            }
                            if (!found)
                            {
                                System.out.println("no transactions found!..");
                            }

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
