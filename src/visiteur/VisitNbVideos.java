package visiteur;

public class VisitNbVideos implements Visiteur {

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
        total = total + 1;
    }

    @Override
    public void visit(Article a) {

    }

    //Test
    public int getTotal() {
        return total;
    }
}
