class CinemaEntrance {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Definindo o valor da entrada inteira
        double valorInteira = 32.00;

        System.out.println("Selecione a opção:");
        System.out.println("1. Entrada inteira");
        System.out.println("2. Meia entrada para crianças até 12 anos");
        System.out.println("3. Meia entrada para estudantes");

        int opcao = scanner.nextInt();

        double valorFinal = 0.0;

        switch (opcao) {
            case 1:
                valorFinal = valorInteira;
                break;
            case 2:
                System.out.println("Informe a idade da criança:");
                int idade = scanner.nextInt();
                if (idade <= 12) {
                    valorFinal = valorInteira / 2; // Meia entrada
                } else {
                    System.out.println("Essa criança não se qualifica para meia entrada.");
                    valorFinal = valorInteira; // Entrada inteira
                }
                break;
            case 3:
                System.out.println("Você possui carteira de estudante? (S/N)");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("S")) {
                    valorFinal = valorInteira / 2; // Meia entrada
                } else {
                    System.out.println("Você não possui carteira de estudante, por favor selecione outra opção.");
                    valorFinal = valorInteira; // Entrada inteira
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                return;
        }

        System.out.println("O valor a ser pago é: R$ " + valorFinal);

        scanner.close();
    }
}
