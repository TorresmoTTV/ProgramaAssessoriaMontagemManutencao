/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grand
 */
public class Projeto {

    private int idProjeto;
    private String nome;
    private String status;
    private String dataInicio;
    private String dataFim;
    private int idTecnico;
    private int idCliente;

    public Projeto(int idProjeto, String nome, String status, String dataInicio, String dataFim, int idTecnico, int idCliente) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idTecnico = idTecnico;
        this.idCliente = idCliente;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do projeto atualizado para: " + novoStatus);
    }

    public void acompanharProjeto() {
        System.out.println("Acompanhando projeto: " + nome);
    }
}
