package servicos;

public class ServicosFactory {

    // Método para obter uma instância do UsuarioServicos
    public static UsuarioServicos getUsuarioServicos() {
        return new UsuarioServicos();
    }

    // Método para obter uma instância do VerificaServicos
    public static VerificaServicos getVerificaServicos() {
        return new VerificaServicos();
    }

    // Método para obter uma instância do OrdemDeServicoServicos
    public static OrdemDeServicoServicos getOrdemDeServicoServicos() {
        return new OrdemDeServicoServicos();
    }

    // Método para obter uma instância do ProjetoServicos
    public static ProjetoServicos getProjetoServicos() {
        return new ProjetoServicos();
    }

    // Método para obter uma instância do RelatorioServicos
    public static RelatorioServicos getRelatorioServicos() {
        return new RelatorioServicos();
    }
}
