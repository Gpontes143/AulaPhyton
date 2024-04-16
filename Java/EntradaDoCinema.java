class EntradaDoCinema {

    public static void main(String[] args) {
        // Guilherme Pontes Campos

        java.util.Scanner leitor = new java.util.Scanner(System.in);   

        double valorInteira = 32.00;

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Entrada inteira");
            System.out.println("2. Meia entrada para crianças até 12 anos");
            System.out.println("3. Meia entrada para estudantes");

            int opcao = leitor.nextInt();

            double preco = 0.0;

            switch (opcao) {
                case 1:
                    preco = valorInteira;
                    System.out.println("Valor pago: $" + preco);
                    return;
                case 2:
                    System.out.println("Informe a idade da criança:");
                    int idade = leitor.nextInt();
                    if (idade <= 12) {
                        preco = valorInteira / 2;
                        System.out.println("Valor pago: $" + preco);
                        return;
                    } else {
                        System.out.println("Essa criança não se qualifica para meia entrada, por favor selecione outra opção.");
                        continue;
                    }
                case 3:
                    System.out.println("Você possui carteira de estudante? (S/N)");
                    String resposta = leitor.next();
                    if (resposta.equalsIgnoreCase("S")) {
                        preco = valorInteira / 2;
                        System.out.println("Valor pago: $" + preco);
                        return;
                    } else {
                        System.out.println("Você não possui carteira de estudante, por favor selecione outra opção.");
                        continue;
                    }   
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    continue;
                    
            }
            
        }
            
    }
   
}
