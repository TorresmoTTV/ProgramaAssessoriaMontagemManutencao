package dao;

public class DAOFactory {
    private static ClienteDAO cDao = new ClienteDAO();
    private static TecnicoDAO tDao = new TecnicoDAO();
    private static AdministradorDAO aDao = new AdministradorDAO();

    public static ClienteDAO getClienteDAO() {
        return cDao;
    }

    public static TecnicoDAO getTecnicoDAO() {
        return tDao;
    }

    public static AdministradorDAO getAdministradorDAO() {
        return aDao;
    }

}
