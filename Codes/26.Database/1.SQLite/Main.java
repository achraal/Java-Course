import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main{
	public static void main(String[] args){
		try{
			Connection c = DriverManager.getConnection("jdbc:sqlite:base.db");
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM Products");
			
			int i = 1;
			System.out.println("Les produits de la database : ");
			
			while(rs.next()){
				String name = rs.getString("product_name");
				float price = rs.getFloat("product_price");
				
				System.out.println(i + " : " + name + " (" + price +" $)");
				i++;
			}
			
			System.out.println("");
			s.executeUpdate("INSERT INTO Products VALUES (11, 'Iphone 15 Pro',555.6, 36)");
			System.out.println("Produit ajouté.");
			
			c.close();
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}
}