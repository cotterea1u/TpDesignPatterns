package appli;

public class SupportDeComm {
    private String nomPhoto;
    private String fichier;
    private int annee;
    private String texte;
    private String auteur;

    public SupportDeComm(String nom, String fichier, int annee, String texte) {
        this.nomPhoto = nom;
        this.fichier = fichier;
        this.annee = annee;
        this.texte = texte;
    }

    public String getNom() {
        return this.nomPhoto;
    }

    public int getDate() {
        return this.annee;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String getFichier() {
        return this.fichier;
    }

    public String getTexte() {
        return this.texte;
    }
}
