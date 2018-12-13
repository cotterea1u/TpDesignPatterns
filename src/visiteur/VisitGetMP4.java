package visiteur;

import java.util.ArrayList;

public class VisitGetMP4 implements Visiteur {


    ArrayList<Video> video = new ArrayList<>();

    @Override
    public void visit(Album a) {
        for (Media m : a.als){
            m.accept(this);
        }
    }

    @Override
    public void visit(Photo p) {

    }

    @Override
    public void visit(Video v) {

        if(v.nomFichier.substring(v.nomFichier.length() - 4).equals(".mp4")){
            video.add(v);
        }
    }

    @Override
    public void visit(Article a) {

    }

    //Test de la question 7
    public ArrayList<Video> getMP4 (){
        return video;
    }
}
