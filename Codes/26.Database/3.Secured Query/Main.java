import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Main{
	public static void main(String[] args){
	
		try{
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/productsjava", "root", "");
			PreparedStatement ps = c.prepareStatement("UPDATE PRODUCTS SET product_name = ? WHERE product_id = ?");
			
			ps.setString(1, "Apple IPhone 15 Pro");
			ps.setInt(2, 5);
			ps.setString(1, "Ordinateur portable Lenovo");
			ps.setInt(2, 3);
			
			ps.executeUpdate();
			System.out.println("Ligne modifiées.");

			ps.close();
			c.close();
		}
		catch(SQLException e){
			System.out.println("Erreur ! " + e.getMessage());
		}
	}
}