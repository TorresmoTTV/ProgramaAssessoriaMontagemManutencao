package dao;

public class DAOFactory {
    private static UsuarioDAO uDao = new UsuarioDAO();

    public static UsuarioDAO getUsuarioDAO() {
        return uDao;
    }

}
