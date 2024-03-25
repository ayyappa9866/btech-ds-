package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
public class MainSceneController {
	@FXML
	private AnchorPane l1;
	@FXML
	private TextField tf1;
	@FXML
	private Label l2;
	@FXML
	private TextField tf2;
	@FXML
	private Label l3;
	@FXML
	private Label l4;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;

	// Event Listener on Button[#b1].onAction
	@FXML
	public void onAdd(ActionEvent event) {
		Integer num1 = Integer.parseInt(tf1.getText());
		Integer num2 = Integer.parseInt(tf2.getText());
		l4.setText(""+(num1 + num2));
	}
	// Event Listener on Button[#b2].onAction
	@FXML
	public void onSub(ActionEvent event) {
		Integer num1 = Integer.parseInt(tf1.getText());
		Integer num2 = Integer.parseInt(tf2.getText());
		l4.setText(""+(num1 - num2));
	}
	// Event Listener on Button[#b3].onAction
	@FXML
	public void onMul(ActionEvent event) {
		Integer num1 = Integer.parseInt(tf1.getText());
		Integer num2 = Integer.parseInt(tf2.getText());
		l4.setText(""+(num1 * num2));
	}
	// Event Listener on Button[#b4].onAction
	@FXML
	public void onDiv(ActionEvent event) {
		Integer num1 = Integer.parseInt(tf1.getText());
		Integer num2 = Integer.parseInt(tf2.getText());
		l4.setText(""+(num1 / num2));
	}
	// Event Listener on Button[#b5].onAction
	@FXML
	public void onRem(ActionEvent event) {
		Integer num1 = Integer.parseInt(tf1.getText());
		Integer num2 = Integer.parseInt(tf2.getText());
		l4.setText(""+(num1 % num2));
	}
}
