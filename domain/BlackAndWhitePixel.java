package domain;

public class BlackAndWhitePixel extends Pixel {
    private boolean isBlack;

    public BlackAndWhitePixel(){
        super();
        this.isBlack = false;
    }

    public BlackAndWhitePixel(boolean isBlack){
        super();
        this.isBlack = isBlack;
    }

    public BlackAndWhitePixel(boolean isBlack, int size){
        super(size);
        this.isBlack = isBlack;
    }

    public BlackAndWhitePixel(boolean isBlack, int size, int x, int y){
        super(size, x, y);
        this.isBlack = isBlack;
    }
}
