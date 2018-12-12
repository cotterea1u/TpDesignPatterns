package visiteur;

public class Main {
    public static void main(String[] args) {

        int test;
        VisitNbPhotos v = new VisitNbPhotos();

        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        al.ajouter(p1, p2, p3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (al.toString().equals(res)) : "Bug" ;

        //Test pour la question 4
        //v.visit(al);
        //test=v.get_tot();
        //System.out.print(test);

        Video v1 = new Video(2018, "GJ", "Gillets Jaunes", "Vidéo1.mp3");
        Video v2 = new Video(2018, "Discours", "Macron", "Vidéo2.mp3");

        al.ajouter(v1, v2);
    }
}
