
import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Funcionario> funcionarios  = new ArrayList<>();
    List<Departamento> departamentos = new ArrayList<>();

    public void cadastrarDepartamento(Departamento departamento){

        // 1. Departamento não pode ser null.
        if (departamento == null){
            throw new IllegalArgumentException("Departamento é nulo");
        }

        // 2. Nome não pode ser null nem vazio.
        if (departamento.getNome() == null || departamento.getNome().isEmpty() ) {
            throw new IllegalArgumentException("Nome é nulo ou vazio");
        }

        // 3. Não pode existir outro departamento com o mesmo nome.
        for (Departamento d : departamentos) {
            if (d.getNome().equals(departamento.getNome())) {
                throw new IllegalArgumentException("Já existe departamento cadastrado com esse nome.");
            }
        }
        // 4. Adicionar à lista.
        departamentos.add(departamento);
    }




    public void cadastrarFuncionario(Long idDepartamento, Funcionario funcionario){

        // 1. Procurar o departamento pelo ID.
        Departamento departExiste = null;

        for (Departamento d : departamentos) {
            if (d.getId().equals(idDepartamento)) {
                departExiste = d;
                break;
            }
        }

        // 2. Verificar se o departamento existe.
        if (departExiste == null) {
            throw new IllegalArgumentException("Departamento não encontrado.");
        }

        // 3. Verificar se o departamento está ativo.
        if (!departExiste.isAtivo()) {
            throw new IllegalArgumentException("Departamento está INATIVO.");
        }

        // 4. Funcionário não pode ser null.
        if (funcionario == null) {
            throw new IllegalArgumentException("Funcionário é nulo");
        }

        // 5. Nome não pode ser vazio.
        if (funcionario.getNome() == null || funcionario.getNome().isBlank()) {
            throw new IllegalArgumentException("o nome do funcionário está vazio");
        }

        // 6. Salário deve ser maior que 0.
        if (funcionario.getSalario() <= 0) {
            throw new IllegalArgumentException("Salário está negativo.");
        }

        // 7. Não pode existir outro funcionário com o mesmo ID.
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(funcionario.getId())) {
                throw new IllegalArgumentException("Há outro funcionário com o mesmo ID.");
            }
        }
        // 8. Associar o funcionário ao departamento.
        funcionario.setIdDepartamento(idDepartamento);

        // 9. Adicionar funcionário à lista.
        funcionarios.add(funcionario);
    }



    public Funcionario buscarFuncionario(Long idFuncionario){
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(idFuncionario)) {
                return f;
            }
        }
        throw new IllegalArgumentException("ID de funcionário não encontrado.");
    }



    public void aumentarSalario(Long idFuncionario, double percentual){

        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual deve ser maior que zero");
        }
        Funcionario funcionario = buscarFuncionario(idFuncionario);

        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("Funcionário está INATIVO.");

        }
        double aumento = (funcionario.getSalario() * percentual / 100);
        double novoSalario = funcionario.getSalario() + aumento;
        funcionario.setSalario(novoSalario);
    }


    public void transferirFuncionario(Long idFuncionario, Long idDepartamento){

        // 1. Buscar funcionário pelo ID.
        Funcionario funcionario = buscarFuncionario(idFuncionario);

        // 2. Verificar se o funcionário está ativo.
        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("Funcionário é inativo.");

        }
        // 3. Buscar o novo departamento pelo ID.
        Departamento novoDepartExiste = null;
        for (Departamento d : departamentos) {
            if (d.getId().equals(idDepartamento)) {
                novoDepartExiste = d;
                break;
            }
        }
        // 4. Verificar se o departamento existe.
        if (novoDepartExiste == null) {
            throw new IllegalArgumentException("Departamento não existe.");
        }

        // 5. Verificar se o novo departamento está ativo.
        if (!novoDepartExiste.isAtivo()) {
            throw new IllegalArgumentException("NOVO Departamento está INATIVO.");
        }

        // 6. Verificar se o funcionário já pertence ao departamento informado.
        if (funcionario.getIdDepartamento().equals(idDepartamento)) {
            throw new IllegalArgumentException("Funcionário já pertence a esse departamento.");
        }
        // 7. Alterar o idDepartamento do funcionário.
        funcionario.setIdDepartamento(idDepartamento);
    }


    public void desativarDepartamento(Long idDepartamento){

        // 1. Buscar departamento pelo ID.
        Departamento departt = null;
        for (Departamento d : departamentos) {
            if (d.getId().equals(idDepartamento)) {
                departt = d;
                break;
            }
        }
        // 2. Verificar se existe.
        if (departt == null) {
            throw new IllegalArgumentException("Departamento não existe.");
        }

        // 3. Verificar se já está inativo.
        if (!departt.isAtivo()) {
            throw new IllegalArgumentException("Departamento está INATIVO.");
        }

        // 5. Procurar todos os funcionários, Verificar se existe algum
        // funcionário ativo pertencente ao departamento,
        // Se existir funcionário ativo → lançar exceção.
        for (Funcionario f : funcionarios) {
            if (f.getIdDepartamento().equals(idDepartamento) && f.isAtivo()) {
                throw new IllegalArgumentException("Há funcionários ATIVOS");
            }
        }
        // 6. Caso contrário → desativar departamento.
        departt.setAtivo(false);
    }
}

