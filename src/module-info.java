module My_SDA_Project {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;
	requires java.sql;
	requires javafx.graphics;
	
	
	opens Resources to javafx.graphics, javafx.fxml;
	opens Presentation to javafx.fxml; 
	exports Presentation;
	
}
