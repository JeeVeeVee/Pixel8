package code_generator;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class CodeGeneratorControlla {
    public AnchorPane anchor;
    public Button generateButton;
    public Label generateCodeLabel;

    private CodeGeneratorModel model;

    public CodeGeneratorControlla(){
        this.model = new CodeGeneratorModel();
    }

    public void initialize() {
        System.out.println("test");
        this.model = new CodeGeneratorModel();
        ArrayList<ClickablePane> newPanes = new ArrayList<>();
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j++){
                System.out.println(i + j);
                ClickablePane newPane = new ClickablePane(i, j);
                newPane.setLayoutX(120 + i * 100);
                newPane.setLayoutY(60 + j * 100);
                newPane.setPrefSize(100, 100);
                model.addListener(newPane);
                newPane.setOnMouseClicked(e -> click(newPane.getRow(), newPane.getColumn()));
                newPane.setStyle("-fx-background-color : black");
                newPanes.add(newPane);
            }
        }
        for (ClickablePane pane : newPanes){
            anchor.getChildren().add(pane);
        }
        generateButton.setOnAction(e -> generateCodeLabel.setText(model.generateCode()));
    }

    public void click(int x, int y){
        model.toggle(x,y);
    }
}
