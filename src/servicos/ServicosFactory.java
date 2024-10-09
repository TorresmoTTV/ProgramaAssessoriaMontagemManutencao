package servicos;

public class ServicosFactory {
    
    private static UsuarioServicos usuarioS = new UsuarioServicos();
    
    public static UsuarioServicos getUsuarioServicos() {
        return usuarioS;
    }

    private static OrdemDeServicoServicos OrdemDeServicoServicosS = new OrdemDeServicoServicos();
    
    public static OrdemDeServicoServicos getOrdemDeServicoServicos() {
        return OrdemDeServicoServicosS;
    }

    private static ProjetoServicos ProjetoServicosS = new ProjetoServicos();
            
    public static ProjetoServicos getProjetoServicos() {
        return ProjetoServicosS;
    }
    
    private static PerfilDeAcessoServicos PerfilDeAcessoS = new PerfilDeAcessoServicos();
    
    public static PerfilDeAcessoServicos getPerfilDeAcessoServicos() {
        return PerfilDeAcessoS;
    }

    private static GeradorRelatorioPDF GeradorRelatorioPDFs = new GeradorRelatorioPDF();
    
    public static GeradorRelatorioPDF getGeradorRelatorioPDF() {
        return GeradorRelatorioPDFs;
    }

}
