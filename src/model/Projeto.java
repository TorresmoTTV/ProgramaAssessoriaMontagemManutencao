/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author grand
 */
public class Projeto extends OrdemDeServico {

    private int idProjeto;
    private String nome;
    private String status;
    private String dataInicio;
    private String dataFim;
    private int idTecnico;
    private int idCliente;



    public Projeto(int ordemID, String dataCriacao, String status, String descricao, int idCliente, int idTecnico,
            int idProjeto, String nome, String status2, String dataInicio, String dataFim, int idTecnico2,
            int idCliente2) {
        super(ordemID, dataCriacao, status, descricao, idCliente, idTecnico);
        this.idProjeto = idProjeto;
        this.nome = nome;
        status = status2;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        idTecnico = idTecnico2;
        idCliente = idCliente2;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do projeto atualizado para: " + novoStatus);
    }

    public void acompanharProjeto() {
        System.out.println("Acompanhando projeto: " + nome);
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
