package Resources;
import DataAcces.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		 // Obtain a database connection
        try (Connection connection = DatabaseConnection.getConnection()) {
        	
        	System.out.print("YYAYAYY");
            // Perform database operations using 'connection' if needed

            // Load the login page
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            primaryStage.setTitle("Login Page");
            primaryStage.setScene(new Scene(root, 688, 480));
            primaryStage.show();

        } catch (SQLException e) {
            // Handle connection or database operation failure
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
