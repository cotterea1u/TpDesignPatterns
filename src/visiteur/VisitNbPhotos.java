package visiteur;


public class VisitNbPhotos implements Visiteur {

    int total;

    @Override
    public void visit(Album a) {
        for (Media m : a.als){
            m.accept(this);
        }
    }

    @Override
    public void visit(Photo p) {
        total=total+1;
    }

    @Override
    public void visit(Video v) {
    }

    @Override
    public void visit(Article a){
    }


    //Test pour la question 4 et 6
    public int get_tot() {
        return total;
    }
}
