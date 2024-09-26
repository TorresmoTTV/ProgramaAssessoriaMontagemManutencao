/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grand
 */
public class Relatorio {

    private int idRelatorio;
    private String tipo;
    private String dataGeracao;
    private String conteudo;


    public Relatorio(int idRelatorio, String tipo, String dataGeracao, String conteudo) {
        this.idRelatorio = idRelatorio;
        this.tipo = tipo;
        this.dataGeracao = dataGeracao;
        this.conteudo = conteudo;
    }

    

    public void gerarRelatorio() {
        System.out.println("Relatório gerado: " + conteudo);
    }

    public void visualizar() {
        System.out.println("Visualizando relatório de tipo: " + tipo);
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
