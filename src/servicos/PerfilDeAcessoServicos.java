/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PerfilDeAcessoDAO;

/**
 *
 * @author 182310076
 */
public class PerfilDeAcessoServicos {

    private PerfilDeAcessoDAO paDAO = DAOFactory.getPerfilDeAcessoDAO();

    public void cadastrarPerfilDeAcesso(PerfildeAcesso perfil) {
        perfilDeAcessoDAO.cadastrarPerfilDeAcesso(perfil);
    }

    // Método para buscar um perfil de acesso pelo ID
    public PerfildeAcesso buscarPerfilDeAcessoPorId(int id) {
        return perfilDeAcessoDAO.getPerfilDeAcessoById(id);
    }

    // Método para atualizar um perfil de acesso
    public void atualizarPerfilDeAcesso(PerfildeAcesso perfil) {
        perfilDeAcessoDAO.atualizarPerfilDeAcesso(perfil);
    }

    // Método para deletar um perfil de acesso
    public void deletarPerfilDeAcesso(int id) {
        perfilDeAcessoDAO.deletarPerfilDeAcesso(id);
    }

    // Método para listar todos os perfis de acesso
    public ArrayList<PerfildeAcesso> listarPerfisDeAcesso() {
        return perfilDeAcessoDAO.getPerfisDeAcesso();
    }
}
