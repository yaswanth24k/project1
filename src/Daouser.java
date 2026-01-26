import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class Daouser {
    public  void saveuser(User user)
    {
        String sql="insert into users (user_id,name,email,phonenumber,balance) values (?,?,?,?,?)";
        try (
            Connection con=DBconnection.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
        )
        {
            ps.setString(1, user.getUserId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmailId());
            ps.setString(4, user.getPhoneNumber());
            ps.setDouble(5,user.getBalance());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
