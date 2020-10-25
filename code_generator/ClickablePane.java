package code_generator;

import javafx.collections.ObservableList;
import javafx.css.Style;
import javafx.scene.layout.Pane;

public class ClickablePane extends Pane implements Listener {

    private int row;
    private int column;

    public ClickablePane(){
        super();
    }

    public ClickablePane(int x, int y){
        super();
        this.row = x;
        this.column = y;
    }

    public ObservableList<String> getStyleClassAsObservableList(){
        return super.getStyleClass();
    }

    @Override
    public void listen(CodeGeneratorModel model) {
        if(model.getValue(row, column)){
            this.getStylesheets().add("code_generator.css");
            this.getStyleClass().add("");
        }
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
