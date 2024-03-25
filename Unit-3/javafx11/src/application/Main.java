package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FontWeight fw = FontWeight.NORMAL;
			FontPosture fp = FontPosture.REGULAR;
			Label l1 = new Label("Welcome To JavaFx");
			HBox h = new HBox(l1);
			h.setPadding(new Insets(10,10,10,10));
			RadioButton rb1 = new RadioButton("Red");
			RadioButton rb2 = new RadioButton("Green");
			RadioButton rb3 = new RadioButton("Blue");
			ToggleGroup tg = new ToggleGroup();
			rb1.setToggleGroup(tg);
			rb2.setToggleGroup(tg);
			rb3.setToggleGroup(tg);
			rb1.setOnAction(e -> {
				l1.setTextFill(Paint.valueOf("RED"));
			});
			rb2.setOnAction(e -> {
				l1.setTextFill(Paint.valueOf("GREEN"));
			});
			rb3.setOnAction(e -> {
				l1.setTextFill(Paint.valueOf("BLUE"));
			});
			HBox h1 = new HBox();
			h1.getChildren().addAll(rb1,rb2,rb3);
			h1.setPadding(new Insets(10,10,10,10));
			h1.setSpacing(15);
			//Check Boxes
			CheckBox c1 = new CheckBox("Normal");
			CheckBox c2 = new CheckBox("Bold");
			CheckBox c3 = new CheckBox("Italic");
			HBox h2 = new HBox();
			h2.getChildren().addAll(c1,c2,c3);
			h2.setPadding(new Insets(10,10,10,10));
			h2.setSpacing(15);
			
			ComboBox<Integer> cb1 = new ComboBox<>();
			cb1.setValue(10);
			HBox h3 = new HBox();
			VBox v1 = new VBox(h,h1,h2,h3);
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
