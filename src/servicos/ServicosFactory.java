package servicos;

public class ServicosFactory {
    
    private static UsuarioServicos usuarioS = new UsuarioServicos();
    
    public static UsuarioServicos getUsuarioServicos() {
        return usuarioS;
    }

    private static VerificaServicos verificaS = new VerificaServicos();
    
    public static VerificaServicos getVerificaServicos() {
        return verificaS;
    }

    private static OrdemDeServicoServicos OrdemDeServicoServicosS = new OrdemDeServicoServicos();
    
    public static OrdemDeServicoServicos getOrdemDeServicoServicos() {
        return OrdemDeServicoServicosS;
    }

    private static ProjetoServicos ProjetoServicosS = new ProjetoServicos();
            
    public static ProjetoServicos getProjetoServicos() {
        return ProjetoServicosS;
    }
    
    private static RelatorioServicos RelatorioServicosS = new RelatorioServicos();
            
    public static RelatorioServicos getRelatorioServicos() {
        return RelatorioServicosS;
    }

    private static GeradorRelatorioPDF GeradorRelatorioPDFs = new GeradorRelatorioPDF();
    
    public static GeradorRelatorioPDF getGeradorRelatorioPDF() {
        return GeradorRelatorioPDFs;
    }

}
