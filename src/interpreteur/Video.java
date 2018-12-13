package interpreteur;

import java.util.ArrayList;

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
        return "Vidéo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    public int getNombreDePhotos(){
        return 0;
    }

    @Override
    public int getNombreDeVideos() {
        return 1;
    }

    @Override
    public int getNombreDArticle() {
        return 0;
    }

    @Override
    public ArrayList<Video> getMP4() {
        ArrayList<Video> video=new ArrayList<>();
        if(this.nomFichier.substring(this.nomFichier.length() - 4).equals(".mp4")){
            video.add(this);
        }
        return video;
    }

    @Override
    public ArrayList<Article> getTexte(String auteur) {
        ArrayList<Article> article= new ArrayList<>();
        return article;
    }
}
