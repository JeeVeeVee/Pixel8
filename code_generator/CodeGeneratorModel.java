package code_generator;

import java.util.ArrayList;

public class CodeGeneratorModel {
    private boolean[][] figureInSpe;
    private ArrayList<Listener> listeners;

    public CodeGeneratorModel(){
        figureInSpe = new boolean[5][5];
        listeners = new ArrayList<>();
    }
    public void addListener(Listener l){
        listeners.add(l);
    }

    public void toggle(int x, int y){
        figureInSpe[x][y] = ! figureInSpe[x][y];
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                /*if(figureInSpe[i][j])
                    System.out.print("#");
                else{
                    System.out.print("*");
                }*/
            }
            System.out.println("");
        }
        notifyListeners();
    }

    public void notifyListeners(){
        for (Listener listener : listeners) {
            listener.listen(this);
        }
    }

    public boolean getValue(int x, int y){
        return figureInSpe[x][y];
    }
}
