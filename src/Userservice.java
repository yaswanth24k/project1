import java.util.ArrayList;
import java.util.List;

public class Userservice {



    public static List<Transactions> gettransactionhistory(List<Transactions> transactions,String currentUserId){
        List<Transactions> result=new ArrayList<>();


        for (int i=0;i<transactions.size();i++)
        {
            Transactions t=transactions.get(i);
            if (t.getSenderId().equals(currentUserId)||t.getReceiverId().equals(currentUserId))
            {
                result.add(transactions.get(i));
            }
        }

    return result;
    }


    public static int finduserindex(List<User> users, String userId)
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

    public static boolean finduserexist(List<User> users, String userId)
    {
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).getUserId().equals(userId))
            {
                return true;
            }
        }
        return false;
    }


    public static boolean isvalidtransaction(double amount, List<User> users, int userindx)
    {
        if (amount>users.get(userindx).getBalance())
        {
            return true;
        }
        return false;
    }

}
