package interpreteur;

import java.util.ArrayList;

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

    public int getNombreDePhotos(){
        return 0;
    }

    @Override
    public int getNombreDeVideos() {
        return 0;
    }

    @Override
    public int getNombreDArticle() {
        return 1;
    }

    @Override
    public ArrayList<Video> getMP4() {
        ArrayList<Video> video= new ArrayList<>();
        return video;
    }

    @Override
    public ArrayList<Article> getTexte(String auteur) {
        ArrayList<Article> article= new ArrayList<>();
        if(this.auteur==auteur){
            article.add(this);
        }
        return article;
    }
}
