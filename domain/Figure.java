package domain;

public class Figure {
    Pixel[][] pixels;

    public Figure(){
        pixels = new Pixel[5][5];
    }

    public Figure(String code){
        if(code.length() != 25){
            throw new IllegalArgumentException("code voor een figuur moet exact 25 tekens bevatten");
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(code.substring(i * 5 + j) == "X"){

                }
            }
        }
    }
}
