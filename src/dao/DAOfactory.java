package dao;

public class DAOfactory {

    private static VitimaDAO vDao = new VitimaDAO();

    public static VitimaDAO geVitimaDAO() {
        return vDao;
    }

}
