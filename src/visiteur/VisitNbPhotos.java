package visiteur;


public class VisitNbPhotos implements Visiteur {

    Visiteur v;
    @Override
    public int see_Album(Album a) {
        int total = 0;

        return total;
    }

    @Override
    public int see_Photo(Photo p) {
        return 1;
    }
}
