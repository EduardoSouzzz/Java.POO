
import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes =  new ArrayList<>();
    List<Produto> produtos =  new ArrayList<>();
    List<Pedido> pedidos =  new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {

        if (cliente == null){
            throw new IllegalArgumentException("Cliente não foi informado.");
        }

        if (cliente.getNome() == null || cliente.getNome().isEmpty()){
            throw new IllegalArgumentException("Nome de cliente não foi informado.");
        }

        for (Cliente c : clientes){
            if (c.getId().equals(cliente.getId())){
                throw new IllegalArgumentException("ID não pode ser repetido.");
            }
        }
        cliente.setAtivo(true);
        clientes.add(cliente);
    }




    public void cadastrarProduto(Produto produto) {

        if (produto == null){
            throw new IllegalArgumentException("Produto não foi informado.");
        }

        if (produto.getNome() == null){
            throw new IllegalArgumentException("Nome do produto não foi informado.");
        }

        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }

        if (produto.getEstoque() < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }

        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())){
                throw new IllegalArgumentException("ID do produto não pode ser repetido.");
            }
        }
        produto.setAtivo(true);
        produtos.add(produto);
    }




    public Cliente buscarCliente(Long idCliente) {

        for (Cliente c : clientes){
            if (c.getId().equals(idCliente)){
                return c;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado.");
    }




    public Produto buscarProduto(Long idProduto) {


        for (Produto  p : produtos){
            if (p.getId().equals(idProduto)){
                return p;
            }
        }
        throw new IllegalArgumentException("Produto não encontrado.");
    }




    public void cadastrarPedido(Long idCliente, Long idProduto, int quantidade) {

        Cliente cliente = buscarCliente(idCliente);
        if (!cliente.isAtivo()) {
            throw new IllegalArgumentException("Cliente precisa estar ativo.");
        }


        Produto produto = buscarProduto(idProduto);
        if (!produto.isAtivo()) {
            throw new IllegalArgumentException("Produto precisa estar ativo.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }

        if (quantidade > produto.getEstoque()) {
            throw new IllegalArgumentException("Quantidade NÃO pode ser maior que o estoque disponível.");
        }

        double valorTotal = produto.getPreco() * quantidade;
        Status status = Status.ABERTO;

        Pedido pedido = new Pedido();
        pedido.setId((long) (pedidos.size() + 1));
        pedido.setIdCliente(cliente.getId());
        pedido.setIdProduto(produto.getId());
        pedido.setQuantidade(quantidade);
        pedido.setValorTotal(valorTotal);
        pedido.setStatus(status);

        int estoque = produto.getEstoque() - quantidade;
        produto.setEstoque(estoque);
        pedidos.add(pedido);
    }



    public Pedido buscarPedido(Long idPedido) {
        for (Pedido p : pedidos){
            if (p.getId().equals(idPedido)){
                return p;
            }
        }
        throw new IllegalArgumentException("Pedido não encontrado.");
    }




    public void pagarPedido(Long idPedido) {

        Pedido pedido  = buscarPedido(idPedido);

        if (!pedido.getStatus().equals(Status.ABERTO)) {
            throw new IllegalArgumentException("Pedido não está ABERTO.");
        }
        pedido.setStatus(Status.PAGO);
    }





    public void cancelarPedido(Long idPedido) {
        Pedido pedido  = buscarPedido(idPedido);

        if (!pedido.getStatus().equals(Status.ABERTO)) {
            throw new IllegalArgumentException("ERRO - só pode cancelar pedido em ABERTO.");
        }

        Long idProduto = pedido.getIdProduto();
        Produto produto = buscarProduto(idProduto);
        int estoque = produto.getEstoque();
        int estoqueFinal = estoque += pedido.getQuantidade();
        produto.setEstoque(estoqueFinal);
        pedido.setStatus(Status.CANCELADO);
    }




    public void desativarProduto(Long idProduto) {
        Produto produto = buscarProduto(idProduto);

        if (!produto.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Produto está inativo.");
        }

        for (Pedido pedido : pedidos) {
            if (pedido.getIdProduto().equals(idProduto)
                    && pedido.getStatus().equals(Status.ABERTO)) {
                throw new IllegalArgumentException("ERRO - produto não pode ser desativado, pois" +
                        " o pedido pode estar em ABERTO, PAGO ou CANCELADO.");
            }
        }
        produto.setAtivo(false);
    }





    public void desativarCliente(Long idCliente) {
        Cliente cliente = buscarCliente(idCliente);

        if (!cliente.isAtivo()) {
            throw new IllegalArgumentException("ERRO - cliente está inativo.");
        }

        for (Pedido pedido : pedidos) {
            if (pedido.getIdCliente().equals(idCliente)
            && pedido.getStatus().equals(Status.ABERTO)) {
                throw new IllegalArgumentException("Cliente não pode ser desativado com pedido em ABERTO.");
            }
        }
        cliente.setAtivo(false);
    }




    public void alterarPrecoProduto(Long idProduto, double novoPreco) {
        Produto produtoBuscado = buscarProduto(idProduto);

        if (!produtoBuscado.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Produto está inativo.");
        }

        if (novoPreco <= 0) {
            throw new IllegalArgumentException("ERRO - Novo preço precisa ser maior que zero.");
        }
        produtoBuscado.setPreco(novoPreco);
    }
}
