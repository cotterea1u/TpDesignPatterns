package visiteur;

public interface Visiteur {


    public void visit(Album a);
    public void visit(Photo p);
    public void visit(Video v);
}
