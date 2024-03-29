package BusinessLogicServices;
import Resources.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardService {
    public static void loadDashboard(String userType) {
        try {
            String fxmlFileName = "/Resources/" + userType + "Dashboard.fxml";
            FXMLLoader loader = new FXMLLoader(DashboardService.class.getResource(fxmlFileName));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(userType + " Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
