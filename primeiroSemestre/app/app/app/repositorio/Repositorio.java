package app.repositorio;

public class Repositorio {

    final static Repositorio instancia = new Repositorio();
    private final PessoaDAO pDAO = new PessoaDAOImpl();

    private Repositorio() { }

    public static Repositorio obterInstancia() {
        return instancia;
    }

    public PessoaDAO pessoas() {
        return pDAO;
    }

}