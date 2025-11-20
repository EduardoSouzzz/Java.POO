public class RelatorioFinanceiro implements Relatorio {

    private Double totalVendas;
    private Double totalDespesas;

    public RelatorioFinanceiro(Double totalVendas, Double totalDespesas) {
        this.totalVendas = totalVendas;
        this.totalDespesas = totalDespesas;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(Double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    @Override
    public String gerar() {
        return "===== Relatorio Financeiro =====\n" +
                "Total Vendas: " + totalVendas + "\n" +
                "Total Despesas: " + totalDespesas + "\n" +
                "=========================================";
    }
}
