package repositorio;
import entidade.Pessoa;

import java.util.*;


public class PessoaDAOImpl implements PessoaDAO {


    public PessoaDAOImpl(Map dados, int id) {
        this.id = id;
    }


    private int id;

}