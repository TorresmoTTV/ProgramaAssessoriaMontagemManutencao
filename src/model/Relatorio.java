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
}
