package dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.swing.text.Document;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.OrdemDeServico;
import model.Projeto;

public class GeradorRelatorioPDF {

    public void gerarRelatorioOrdensDeServico(List<OrdemDeServico> ordens)
            throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Relatorio_OrdensDeServico.pdf"));

        document.open();
        document.add(new Paragraph("Relatório de Ordens de Serviço"));
        document.add(new Paragraph(" "));

        for (OrdemDeServico os : ordens) {
            document.add(new Paragraph("ID: " + os.getIdOrdem()));
            document.add(new Paragraph("Data de Criação: " + os.getDataCriacao()));
            document.add(new Paragraph("Condição: " + os.getCondicao()));
            document.add(new Paragraph("Descrição: " + os.getDescricao()));
            document.add(new Paragraph("Usuário: " + os.getFkUsuarioId()));
            document.add(new Paragraph(" "));
        }

        document.close();
    }

    public void gerarRelatorioOProjetos(List<Projeto> ordens)
            throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Relatorio_Projetos.pdf"));

        document.open();
        document.add(new Paragraph("Relatório de Projetos"));
        document.add(new Paragraph(" "));

        for (Projeto p : projeto) {
            document.add(new Paragraph("ID: " + p.getIdProjeto()));
            document.add(new Paragraph("Data de Criação: " + p.getNome()));
            document.add(new Paragraph("Condição: " + p.getCondicao()));
            document.add(new Paragraph("Descrição: " + p.getDataInicio()));
            document.add(new Paragraph("Usuário: " + p.getDataFim()));
            document.add(new Paragraph("Usuário: " + p.getLinkUnboxing()));
            document.add(new Paragraph("Usuário: " + p.getFkOrdemDeServicoIdOrdem()));
            document.add(new Paragraph(" "));
        }

        document.close();
    }
}
