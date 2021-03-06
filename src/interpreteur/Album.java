package interpreteur;

import java.util.ArrayList;
import java.util.Iterator;

public class Album extends Media implements Iterable<Media>{
    protected ArrayList<Media> als ;
    public Album(int d, String nom) {
        super(d, nom);
        this.als = new ArrayList<>(10);
    }

    public void ajouter(Media... s) {
        for (Media sc : s)
            this.als .add(sc) ;
    }


    @Override
    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    @Override
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }

    public int getNombreDePhotos(){
        int taille = 0;
        for(int i = 0; i < als.size(); i++)
        {
            taille= taille+ als.get(i).getNombreDePhotos();
        }
        return taille;
    }

    @Override
    public int getNombreDeVideos() {
        int taille = 0;
        for(int i = 0; i < als.size(); i++)
        {
            taille= taille+ als.get(i).getNombreDeVideos();
        }
        return taille;
    }

    @Override
    public int getNombreDArticle() {
        int taille = 0;
        for(int i = 0; i < als.size(); i++)
        {
            taille= taille+ als.get(i).getNombreDArticle();
        }
        return taille;
    }

    @Override
    public ArrayList<Video> getMP4() {
        ArrayList<Video> video= new ArrayList<>();
        for(Media m : this.als){
            video.addAll(m.getMP4());
        }
        return video;
    }

    @Override
    public ArrayList<Article> getTexte(String auteur) {
        ArrayList<Article> article= new ArrayList<>();
        for(Media m : this.als){
            article.addAll(m.getTexte("Moi"));
        }
        return article;
    }
}