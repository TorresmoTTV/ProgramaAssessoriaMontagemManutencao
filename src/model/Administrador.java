package model;

public class Administrador extends Usuario {

    public void emitirRelatorios() {
        System.out.println("Emitindo relatórios...");
    }

    public void gerenciarOrdens() {
        System.out.println("Gerenciando ordens de serviço.");
    }
}
