package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.OrdemDeServico;

public class GeradorRelatorioPDF {

    public void gerarRelatorio(List<OrdemDeServico> ordens) throws FileNotFoundException, DocumentException {
        Document document = new Document();

        // Criando diretório se não existir
        File diretorio = new File("C:\\Relatórios\\Relatórios_OrdensDeServico");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        PdfWriter.getInstance(document, new FileOutputStream("C:\\Relatórios\\Relatórios_OrdensDeServico\\Relatorio_OrdensDeServico.pdf"));

        document.open();
        document.add(new Paragraph("Relatório de Ordens de Serviço"));
        document.add(new Paragraph(" "));

        for (OrdemDeServico os : ordens) {
            document.add(new Paragraph("ID: " + os.getIdOrdem()));
            document.add(new Paragraph("Data de Criação: " + os.getDataCriacao()));
            document.add(new Paragraph("Condição: " + os.getCondicao()));
            document.add(new Paragraph("Descrição: " + os.getDescricao()));
            document.add(new Paragraph("Usuário: " + os.getFkUsuarioIdUsuario()));
            document.add(new Paragraph(" "));
        }

        document.close();
    }
}
