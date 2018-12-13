package visiteur;

import java.util.ArrayList;

public class VisitGetTexte implements Visiteur {

    String auteur;
    ArrayList<Article> article = new ArrayList<>();

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

        if(a.auteur.equals(auteur)){
            article.add(a);
        }
    }

    public void auteur(String a){
        this.auteur = a;
    }

    public ArrayList<Article> getArticle(){
        return article;
    }
}
