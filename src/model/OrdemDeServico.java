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

    public int getOrdemID() {
        return ordemID;
    }

    public void setOrdemID(int ordemID) {
        this.ordemID = ordemID;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }
    
}
