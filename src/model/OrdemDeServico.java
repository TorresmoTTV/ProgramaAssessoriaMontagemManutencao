/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grand
 */
public class OrdemDeServico {

    private int ordemID;
    private String dataCriacao;
    private String status;
    private String descricao;
    private int idCliente;
    private int idTecnico;

    public OrdemDeServico(int ordemID, String dataCriacao, String status, String descricao, int idCliente, int idTecnico) {
        this.ordemID = ordemID;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.descricao = descricao;
        this.idCliente = idCliente;
        this.idTecnico = idTecnico;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da ordem atualizado para: " + novoStatus);
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório da ordem de serviço...");
    }
}
