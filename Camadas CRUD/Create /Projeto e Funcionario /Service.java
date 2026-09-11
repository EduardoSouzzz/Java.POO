
import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Projeto> projetos = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarProjeto(Projeto projeto) {

        if (projeto == null) {
            throw new IllegalArgumentException("O projeto deve ser Informado");
        }

        if (projeto.getNome() == null || projeto.getNome().isEmpty()) {
            throw new IllegalArgumentException("O projeto deve ser Informado");
        }

        if (projeto.getOrcamento() <= 0) {
            throw new IllegalArgumentException("O orcamento deve ser maior que zero");
        }

        for (Projeto p : projetos) {
            if (p.getNome().equals(projeto.getNome())) {
                throw new IllegalArgumentException("Não pode existir outro projeto com o mesmo nome!");
            }
        }
        projetos.add(projeto);
    }


    public boolean cadastrarFuncionario(Long idProjeto, Funcionario funcionario) {

        Projeto projetoExiste = null;
        for (Projeto p : projetos) {
            if (p.getId().equals(idProjeto)) {
                projetoExiste = p;
                break;
            }
        }

        if (projetoExiste == null) {
            throw new IllegalArgumentException("O projeto não existe!");
        }

        if (!projetoExiste.isAtivo()) {
            throw new IllegalArgumentException("O projeto deve ser Ativo!");
        }

        if (funcionario == null) {
            throw new IllegalArgumentException("O funcionario não existe");
        }

        if (funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
            throw new IllegalArgumentException("O funcionario é nulo ou vazio!");
        }

        for (Funcionario f : funcionarios) {
            if (f.getId().equals(funcionario.getId())) {
                throw new IllegalArgumentException("Não pode existir outro funcionario com o mesmo ID!");
            }
        }
        funcionario.setIdProjeto(projetoExiste.getId());
        funcionarios.add(funcionario);
        return false;
    }


    public Projeto buscarProjeto(Long idProjeto) {
        for (Projeto p : projetos) {
            if (p.getId().equals(idProjeto)) {
                return p;
            }
        }
        throw new IllegalArgumentException("ID do projeto não encontrado.");
    }


    public Funcionario buscarFuncionario(Long idFuncionario) {
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(idFuncionario)) {
                return f;
            }
        }
        throw new IllegalArgumentException("ID do funcionario não encontrado.");
    }



    public void alocarFuncionario(Long idFuncionario, Long idNovoProjeto) {

        Funcionario funcionario = buscarFuncionario(idFuncionario);
        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("O funcionario deve ser Ativo!");
        }

        Projeto novoProjeto = buscarProjeto(idNovoProjeto);

        if (novoProjeto == null) {
            throw new IllegalArgumentException("O projeto deve existir!");
        }

        if (!novoProjeto.isAtivo()) {
            throw new IllegalArgumentException("O novo projeto deve ser Ativo!");
        }

        if (funcionario.getIdProjeto().equals(idNovoProjeto)) {
            throw new IllegalArgumentException("Funcionário não pode já estar nesse projeto");
        }
        funcionario.setIdProjeto(novoProjeto.getId());
    }


    public void desativarFuncionario(Long idFuncionario) {

        Funcionario funcionario = buscarFuncionario(idFuncionario);

        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("O funcionario deve ser Ativo!");
        }
        funcionario.setAtivo(false);
    }



    public void desativarProjeto(Long idProjeto) {

        Projeto projeto = buscarProjeto(idProjeto);

        if (projeto == null) {
            throw new IllegalArgumentException("O projeto deve existir!");
        }

        if (!projeto.isAtivo()) {
            throw new IllegalArgumentException("O projeto deve ser Ativo!");
        }

        for (Funcionario f : funcionarios) {
            if (f.getIdProjeto().equals(idProjeto) && f.isAtivo()) {
                throw new IllegalArgumentException("Há funcionário(s) ativo(s) no projeto.");
            }
        }
        projeto.setAtivo(false);
    }
}

