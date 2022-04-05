package RPNCalculator;

import java.io.IOError;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException{
        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // Scene scene = new Scene(new StackPane(l), 640, 480);
        URL xmlResource = getClass().getResource("/ui/calcbuttons2.xml");
        GridPane gp = FXMLLoader.load(xmlResource);
        Scene scene = new Scene(gp, 640, 480);
        URL cssResource = getClass().getResource("/ui/calcbuttons.css");
        scene.getStylesheets().add(cssResource.toString());
        stage.setScene(scene);
        stage.show();
    }

}