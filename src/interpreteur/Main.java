package interpreteur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Album alb = new Album(2018, "Album Sen");
        Photo ph1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo ph2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo ph3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        alb.ajouter(ph1, ph2, ph3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (alb.toString().equals(res)) : "Bug" ;

        Video v1 = new Video(2018, "GJ", "Gillets Jaunes", "Vidéo1.mp4");
        Video v2 = new Video(2018, "Discours", "Macron", "Vidéo2.mp3");

        alb.ajouter(v1, v2);

        Article a1 = new Article(2018, "Poème", "Moi", "Ceci est un poème.");

        alb.ajouter(a1);


        //Test de la fonction getNombreDePhotos()
        int nb = alb.getNombreDePhotos();
        System.out.printf("Le nombre de photo de l'album est de : %d\n", nb);

        nb = alb.getNombreDeVideos();
        System.out.printf("Le nombre de vidéo de l'album est de : %d\n",nb);

        nb = alb.getNombreDArticle();
        System.out.printf("Le nombre d'article de l'album est de : %d\n",nb);

        //Test de getMP4

        ArrayList<Video> video = alb.getMP4();
        System.out.print("Voici la liste des vidéos en format mp4 :"+video+"\n");

        //Test de getTexte()
        ArrayList<Article> article = alb.getTexte("Moi");
        System.out.print("Voici les textes qui ont pour auteur Moi :"+article+"\n");

    }
}
