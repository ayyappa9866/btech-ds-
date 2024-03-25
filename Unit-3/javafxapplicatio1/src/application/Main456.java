package application;	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
public class Main456 extends Application{
	Button b1;
	int count = 0;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			b1 = new Button("Click Me");
			b1.setOnAction(e ->{count++;b1.setText(""+count);});
			BorderPane root = new BorderPane(b1);
			Scene scene = new Scene(root,400,400);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

