package visiteur;

public class Video extends Media {
    protected String auteur;
    protected String nomFichier;
    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    public void accept(Visiteur v){
        v.visit(this);
    }
}
