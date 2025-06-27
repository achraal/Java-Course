import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main{
	public static void main(String[] args){
	
		try{
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/productsjava", "root", "");
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM Products");
			
			System.out.println("Les données de la table Products : ");
			while(rs.next()){
				String name = rs.getString("product_name");
				System.out.println(name);
			}
			
			System.out.println("");
			s.executeUpdate("DELETE FROM PRODUCTS WHERE product_id = 11");
			System.out.println("Ligne supprimées.");
						
			rs.close();
			s.close();
			c.close();
		}
		catch(SQLException e){
			System.out.println("Erreur ! " + e.getMessage());
		}
	}
}