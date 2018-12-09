package interpreteur;

public class Main {
    public static void main(String[] args) {
        Album alb = new Album(2018, "Album Sen");
        Photo ph1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo ph2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo ph3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        alb.ajouter(ph1, ph2, ph3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (alb.toString().equals(res)) : "Bug" ;

        //Test de la fonction getNombreDePhotos()

        //int nb = alb.getNombreDePhotos();
        //System.out.printf("Le nombre de photo de l'album est de : %d\n", nb);

    }
}
