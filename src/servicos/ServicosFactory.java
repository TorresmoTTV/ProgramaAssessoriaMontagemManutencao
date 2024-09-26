package servicos;

public class ServicosFactory {
    private static UsuarioServicos usuarioS = new UsuarioServicos();

    public static UsuarioServicos getUsuarioServicos() {
        return usuarioS;
    }
}
