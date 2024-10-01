package servicos;

public class ServicosFactory {

    public static UsuarioServicos getUsuarioServicos() {
        return new UsuarioServicos();
    }

    public static VerificaServicos getVerificaServicos() {
        return new VerificaServicos();
    }

    public static OrdemDeServicoServicos getOrdemDeServicoServicos() {
        return new OrdemDeServicoServicos();
    }

    public static ProjetoServicos getProjetoServicos() {
        return new ProjetoServicos();
    }

    public static RelatorioServicos getRelatorioServicos() {
        return new RelatorioServicos();
    }

    public static GeradorRelatorioPDF getGeradorRelatorioPDF() {
        return new GeradorRelatorioPDF();
    }

}
