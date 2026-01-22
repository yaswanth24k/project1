public class User {
  private String userId;
  private String name;
  private String emailId;
  private String phoneNumber;
  private double balance;

   public User(String userid,String name,String emailid,String pho,double bal)
   {
       this.userId=userid;
       this.name=name;
       this.emailId=emailid;
       this.phoneNumber=pho;
       this.balance=bal;
   }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deductBalance(double amount)
    {
        if (amount>0&&amount<=balance)
        {
            balance=balance-amount;
            return true;
        }
        return false;
    }
    public void addBalance(double amount)
    {
         if(amount>0)
         {
             balance=balance+amount;
         }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
