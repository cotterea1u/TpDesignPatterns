package visiteur;

public class Article extends Media {
    protected String auteur;
    protected String texte;
    public Article(int d, String nom, String auteur, String texte) {
        super(d, nom);
        this.auteur = auteur;
        this.texte = texte;
    }

    @Override
    public String toString() {
        return "Article{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    public void accept(Visiteur v){
        v.visit(this);
    }
}
