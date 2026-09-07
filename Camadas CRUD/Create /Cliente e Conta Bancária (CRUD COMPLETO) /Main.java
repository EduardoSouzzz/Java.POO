void main() {

    Service service = new Service();

    Cliente cliente1 = new Cliente(
            1L,
            "Joao",
            true
    );

    Cliente cliente2 = new Cliente(
            2L,
            "Maria",
            false
    );

    Conta conta10 = new Conta(
            10L,
            "12345",
            1000.00,
            true,
            null
    );

    Conta conta20 = new Conta(
            20L,
            "789",
            0.00,
            true,
            null
    );

    service.clientes.add(cliente1);
    service.clientes.add(cliente2);


    // =========================
    // CADASTRAR CONTA
    // =========================

    service.cadastrarConta(1L, conta10);

    System.out.println(conta10);


    // =========================
    // TENTAR CADASTRAR PARA MARIA
    // =========================

    try {

        service.cadastrarConta(2L, conta20);

    } catch (IllegalArgumentException e) {

        System.out.println(e.getMessage());
    }


    // =========================
    // DEPOSITAR
    // =========================

    service.depositar(10L, 500.00);

    System.out.println(
            "Saldo após depósito: R$ " + conta10.getSaldo()
    );


    // =========================
    // SACAR
    // =========================

    service.sacar(10L, 300.00);

    System.out.println(
            "Saldo após saque: R$ " + conta10.getSaldo()
    );


    // =========================
    // TENTAR SACAR DEMAIS
    // =========================

    try {

        service.sacar(10L, 2000.00);

    } catch (IllegalArgumentException e) {

        System.out.println(e.getMessage());
    }


    // =========================
    // TENTAR ENCERRAR
    // =========================

    try {

        service.encerrarConta(1L, 10L);

    } catch (IllegalArgumentException e) {

        System.out.println(e.getMessage());
    }


    // =========================
    // CRIAR CONTA COM SALDO 0
    // =========================

    Conta conta30 = new Conta(
            30L,
            "99999",
            0.00,
            true,
            null
    );

    service.cadastrarConta(1L, conta30);


    // =========================
    // ENCERRAR CONTA 30
    // =========================

    service.encerrarConta(1L, 30L);

    System.out.println(conta30);
}
