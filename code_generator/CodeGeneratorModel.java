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

    public void notifyListeners(){
        for (Listener listener : listeners) {
            listener.listen(this);
        }
    }

    public boolean getValue(int x, int y){
        return figureInSpe[x][y];
    }
}
