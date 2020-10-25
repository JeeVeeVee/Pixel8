package code_generator;

import javafx.scene.layout.Pane;

public class ClickablePane extends Pane implements Listener {

    private int row;
    private int column;

    public ClickablePane(int x, int y){
        super();
        this.row = x;
        this.column = y;
    }

    @Override
    public void listen(CodeGeneratorModel model) {
        if(model.getValue(row, column)){
            this.getStylesheets().add("code_generator.css");
            this.getStyleClass().add("");
        }

    }
}
