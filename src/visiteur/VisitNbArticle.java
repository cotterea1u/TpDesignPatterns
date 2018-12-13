package visiteur;

public class VisitNbArticle implements Visiteur {

    int total;

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

    }

    @Override
    public void visit(Article a) {
        total = total+1;
    }

    public int getTotal(){
        return total;
    }
}
