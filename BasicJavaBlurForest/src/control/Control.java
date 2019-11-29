package control;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Control {
	
	@FXML
    private Pane pane; 
	@FXML
	private ImageView image;
	
	private int cont = 0;

	@FXML
    public void setblur() {
		cont ++;
		image.setEffect(new GaussianBlur(cont));   

    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
	public void focus() {
		cont--;
		image.setEffect(new GaussianBlur(cont));
	}
	
}