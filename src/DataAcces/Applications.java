package DataAcces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Applications {
	
	public void add_application(String email, int ID)
	{
		 try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(
	                     "INSERT INTO Applications (benificiary_email, program_Id) VALUES (?, ?)")) {

	            preparedStatement.setString(1, email);
	            preparedStatement.setInt(2, ID);

	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

