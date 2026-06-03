import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exercise33 {

    public static void transferMoney(
            int fromAccount,
            int toAccount,
            double amount
    ) {

        String url =
                "jdbc:mysql://localhost:3306/bankdb";

        String username = "root";
        String password = "root";

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance - ? WHERE id=?"
                    );

            debit.setDouble(1, amount);
            debit.setInt(2, fromAccount);

            debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance + ? WHERE id=?"
                    );

            credit.setDouble(1, amount);
            credit.setInt(2, toAccount);

            credit.executeUpdate();

            con.commit();

            System.out.println(
                    "Transfer Successful"
            );

            con.close();

        } catch (Exception e) {

            System.out.println(
                    "Transaction Failed"
            );

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        transferMoney(1, 2, 500);
    }
}