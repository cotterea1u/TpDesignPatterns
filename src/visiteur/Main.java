package visiteur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int test;
        ArrayList<Video> testV;
        ArrayList<Article> testA;
        VisitNbPhotos p = new VisitNbPhotos();
        VisitNbVideos v = new VisitNbVideos();
        VisitNbArticle a = new VisitNbArticle();
        VisitGetMP4 g = new VisitGetMP4();
        VisitGetTexte t = new VisitGetTexte();

        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        al.ajouter(p1, p2, p3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (al.toString().equals(res)) : "Bug" ;

        Video v1 = new Video(2018, "GJ", "Gillets Jaunes", "Vidéo1.mp3");
        Video v2 = new Video(2018, "Discours", "Macron", "Vidéo2.mp4");

        al.ajouter(v1, v2);

        Article a1 = new Article(2018, "Poème", "Moi", "Ceci est un poème.");

        al.ajouter(a1);

        //Test pour la question 4 et 6
        p.visit(al);
        test=p.get_tot();
        System.out.print("Voici le nombre de photo :"+test+"\n");

        v.visit(al);
        test=v.getTotal();
        System.out.print("Voici le nombre de vidéo dans l'album :"+test+"\n");

        a.visit(al);
        test=a.getTotal();
        System.out.print("Voici le nombre d'article dans l'album :"+test+"\n");

        //Test de la question 7
        g.visit(al);
        testV=g.getMP4();
        System.out.print("Voici les différentes vidéos .mp4 :"+testV+"\n");

        t.auteur("Moi");
        t.visit(al);
        testA=t.getArticle();
        System.out.print("Voici les différents articles de Moi :"+testA+"\n");
    }
}
