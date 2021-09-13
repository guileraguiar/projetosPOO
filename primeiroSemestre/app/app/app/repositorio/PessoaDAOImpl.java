package app.repositorio;
import app.entidade.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class PessoaDAOImpl implements PessoaDAO {

    final Map<Integer, Pessoa> dados = new HashMap<>();

    @Override
    public void adicionar(Pessoa p) {
        dados.put(p.getId(), p);
    }

    @Override
    public void atualizar(Pessoa p) {
        dados.replace(p.getId(), p);
    }

    @Override
    public void deletarPeloId(int id) {
        dados.remove(id);
    }

    @Override
    public Pessoa obterPeloId(int id) {
        return dados.get(id);
    }

}