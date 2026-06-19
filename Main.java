public class Main {
    public static void main(String[] args) {
        System.out.println("=== INÍCIO DO TESTE DA ORDEM DE SERVIÇO ===");
        
        // Quando instanciamos a OS, ela já nasce no estado Aberto
        OrdemServico os = new OrdemServico("Revisão Geral e Troca de Óleo");

        System.out.println("\n--- Testando transições inválidas (Estado: Aberto) ---");
        os.abrir();      // Deve imprimir: OS aberta não pode ser colocada como aberta novamente
        os.executar();   // Deve imprimir: OS aberta nao pode ser colocada em execução
        os.finalizar();  // Deve imprimir: OS aberta não ser finalizada

        System.out.println("\n--- Executando o Fluxo de Sucesso ---");
        os.diagnosticar(); // *** Aberta --> Diagnóstico
        os.autorizar();    // *** Diagnóstico --> Autorizada
        os.executar();     // *** Autorizada --> EmExecucao
        os.finalizar();    // *** EmExecucao --> Finalizada
        os.testar();       // *** Finalizada --> EmTeste
        os.aprovar();      // *** EmTeste --> Aprovada
        os.pagar();        // *** Aprovada --> Paga

        System.out.println("\n--- Testando transições inválidas (Estado: Paga) ---");
        os.abrir();        // Deve imprimir: OS paga não pode ser colocada aberta
        os.cancelar();     // Deve imprimir: OS paga não pode ser cancelada
        
        System.out.println("\n=== FIM DO TESTE ===");
    }
}