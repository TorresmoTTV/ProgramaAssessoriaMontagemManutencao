package dao;

public class DAOFactory {

    public static UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAO();
    }

    public static OrdemDeServicoDAO getOrdemDeServicoDAO() {
        return new OrdemDeServicoDAO();
    }

    public static ProjetoDAO getProjetoDAO() {
        return new ProjetoDAO();
    }

    public static PerfilDeAcessoDAO getPerfilDeAcessoDAO() {
        return new PerfilDeAcessoDAO();
    }
}
