package Interfaz;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ventana extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
        // Crear la escena y configurar la ventana
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setTitle("Ejemplo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
