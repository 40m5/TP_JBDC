import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        String strClassName = "com.mysql.cj.jdbc.Driver";
        String dbName = "jdb"; 
        String login = "root";
        String motdepasse = ""; 
        String strUrl = "jdbc:mysql://localhost:3306/" + dbName ;

        try {
            Class.forName(strClassName);
            try (Connection conn = DriverManager.getConnection(strUrl, login, motdepasse)) {
                System.out.println("Connexion réussie !");
        
			Statement stAddUser = conn.createStatement();  
			stAddUser.executeUpdate("insert into Acces values (5,'Tom','tomahawk','indien','Etudiant',22)");



            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erreur de connexion !");
            e.printStackTrace();
        }
    }
}
