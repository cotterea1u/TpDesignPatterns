package interpreteur;


import java.util.ArrayList;

public abstract class Media {
    protected int annee ;
    protected String nom ;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }

    public abstract int getNombreDePhotos();
    public abstract int getNombreDeVideos();
    public abstract int getNombreDArticle();
    public abstract ArrayList<Video> getMP4();
    public abstract ArrayList<Article> getTexte(String auteur);
}
