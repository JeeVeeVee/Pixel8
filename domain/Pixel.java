package domain;

import javafx.scene.layout.Pane;

public class Pixel extends Pane {

    private int size;
    private int x;
    private int y;

    public Pixel(){
        super();
        this.size = 5;
        super.setWidth(size);
        super.setHeight(size);
    }

    public Pixel(int size){
        super();
        this.size = size;
        super.setWidth(size);
        super.setHeight(size);
    }

    public Pixel(int size, int x, int y){
        super();
        this.size = size;
        super.setWidth(size);
        super.setHeight(size);
        super.setLayoutX(x * size);
        super.setLayoutY(y * size);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
