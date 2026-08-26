import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Funcionario> funcionarios = new ArrayList<>();

    public void atualizarFuncionario(Long id, Funcionario novosDados) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                funcionario.setNome(novosDados.getNome());
                funcionario.setEmail(novosDados.getEmail());
                funcionario.setCargo(novosDados.getCargo());
                funcionario.setSalario(novosDados.getSalario());
            }
        }
    }

}
