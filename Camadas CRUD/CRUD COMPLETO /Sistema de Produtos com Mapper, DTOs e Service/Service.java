
import java.util.ArrayList;
import java.util.List;


public class Service {

    private Mapper mapper = new Mapper();

    private List<Produto>  produtos = new ArrayList<>();

    private Long idProximo = 1L;



    public ProdutoResponseDTO cadastrar(ProdutoRequestDTO dto) {

        if (dto == null) {
            throw new IllegalArgumentException("Dto é obrigatório.");
        }

        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }

        if (dto.preco() <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }

        if (dto.estoque() < 0) {
            throw new IllegalArgumentException("Estoque está zerado.");
        }

        Produto produto = mapper.toEntity(dto); // mapper transforma DTO na entity
        produto.setId(idProximo++); // altera o id automaticamente
        produtos.add(produto); // guarda a entity

        return mapper.toDTO(produto); // mapper transforma entity para ResponseDTO
    }




    public Produto buscarPorId(Long idProduto) {

        for (Produto produto : produtos) {
            if (produto.getId().equals(idProduto)) {
                return produto;
            }
        }
        throw new IllegalArgumentException("Produto não encontrado.");
    }




    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("DTO é obrigatório");
        }

        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (dto.preco() <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }

        if (dto.estoque() <= 0) {
            throw new IllegalArgumentException("Estoque deve ser maior que zero.");
        }

        Produto produto = buscarPorId(id);

        produto.setNome(dto.nome());
        produto.setPreco(dto.preco());
        produto.setEstoque(dto.estoque());

        return mapper.toDTO(produto);
    }



    public ProdutoResponseDTO aumentarEstoque(Long id, int quantidade) {

        Produto produtoEncontrado = buscarPorId(id);

        if (!produtoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Produto está INATIVO");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }

        int aumentarEstoque = produtoEncontrado.getEstoque() + quantidade;
        produtoEncontrado.setEstoque(aumentarEstoque);
        return mapper.toDTO(produtoEncontrado);
    }



    public ProdutoResponseDTO venderProduto(Long id, int quantidade) {

        Produto produtoEncontrado = buscarPorId(id);

        if (!produtoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Produto está inativo.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }

        if (produtoEncontrado.getEstoque() < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente!.");
        }

        int diminuirEstoque = produtoEncontrado.getEstoque() - quantidade;
        produtoEncontrado.setEstoque(diminuirEstoque);
        return mapper.toDTO(produtoEncontrado);
    }


    public ProdutoResponseDTO desativarProduto(Long id) {

        Produto produtoEncontrado = buscarPorId(id);

        if (!produtoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Produto JÁ está inativo.");
        }
        produtoEncontrado.setAtivo(false);
        return mapper.toDTO(produtoEncontrado);
    }
}

