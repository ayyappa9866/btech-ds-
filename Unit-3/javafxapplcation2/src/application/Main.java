package application;	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label l1 = new Label("Enter Any Number :");
			TextField tf1 = new TextField();
			HBox h1 = new HBox(l1,tf1);
			h1.setPadding(new Insets(10,10,10,10));
			Label l2 = new Label("Enter Any Number :");
			TextField tf2 = new TextField();
			HBox h2 = new HBox(l2,tf2);
			h2.setPadding(new Insets(10,10,10,10));
			Label l3 = new Label("Result :");
			Label l4 = new Label();
			HBox h3 = new HBox(l3,l4);
			h3.setPadding(new Insets(10,10,10,10));
			Button b1 = new Button("+");
			b1.setPadding(new Insets(10,10,10,10));
			b1.setOnAction(e ->{
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				l4.setText(""+(num1 + num2));
			});
			Button b2 = new Button("-");
			b2.setPadding(new Insets(10,10,10,10));
			b2.setOnAction(e ->{
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				l4.setText(""+(num1 - num2));
			});
			Button b3 = new Button("*");
			b3.setPadding(new Insets(10,10,10,10));
			b3.setOnAction(e ->{
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				l4.setText(""+(num1 * num2));
			});
			Button b4 = new Button("/");
			b4.setPadding(new Insets(10,10,10,10));
			b4.setOnAction(e ->{
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				l4.setText(""+(num1 / num2));
			});
			Button b5 = new Button("%");
			b5.setPadding(new Insets(10,10,10,10));
			b5.setOnAction(e ->{
				Integer num1 = Integer.parseInt(tf1.getText());
				Integer num2 = Integer.parseInt(tf2.getText());
				l4.setText(""+(num1 % num2));
			});
			HBox h4 = new HBox(b1,b2,b3,b4,b5);
			h4.setPadding(new Insets(10,10,10,10));
			h4.setSpacing(10);
			VBox v1 = new VBox(h1,h2,h3,h4);
			Scene scene = new Scene(v1,400,400);
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
