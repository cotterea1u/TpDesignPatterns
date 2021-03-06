package interpreteur;

import java.util.ArrayList;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
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

    public int getNombreDePhotos(){
        return 1;
    }

    @Override
    public int getNombreDeVideos() {
        return 0;
    }

    @Override
    public int getNombreDArticle() {
        return 0;
    }

    @Override
    public ArrayList<Video> getMP4() {
        ArrayList<Video> video= new ArrayList<>();
        return video;
    }

    @Override
    public ArrayList<Article> getTexte(String auteur) {
        ArrayList<Article> article= new ArrayList<>();
        return article;
    }
}
