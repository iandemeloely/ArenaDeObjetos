package dao;

public class DAOfactory {

    private static VitimaDAO vDao = new VitimaDAO();

    public static VitimaDAO geVitimaDAO() {
        return vDao;
    }

    private static GuerreiroDAO GDao = new GuerreiroDAO();

    public static GuerreiroDAO geGuerreiroDAO() {
        return GDao;
    }

}
