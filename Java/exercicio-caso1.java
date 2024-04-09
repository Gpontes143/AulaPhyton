//Já tive alguma expêriencia em java e codigos

class Entrada_do_Cinema {

    //
    public static void main(String[] args) {

        //criando objeto para analisar a escolha
        java.util.Scanner leitor = new java.util.Scanner(System.in);   

        //valor da entrada inteira
        double valorInteira = 32.00;

        //fazendo repetições para caso o usuario escolha o incorreto, ele possa retornar as opções
        while (true) {
        //Fazendo as escolhas para o usuario
        System.out.println("Selecione uma opção:");
        System.out.println("1. Entrada inteira");
        System.out.println("2. Meia entrada para crianças até 12 anos");
        System.out.println("3. Meia entrada para estudantes");

        int opcao = leitor.nextInt();

        double preço = 0.0;

        switch (opcao) {
            case 1:
            //se escolher a opção 1, o preço é o valor da entrada inteira = 32.00$
            preço = valorInteira;
            System.out.println("Entrada de $" + valorInteira );
                break;
            case 2:
            //se escolher a opção 2, o preço é o valor da entrada inteira = 32.00$/2 = 16.0
                System.out.println("Informe a idade da criança:");
                int idade = leitor.nextInt();
                if (idade <= 12) {
                    preço = valorInteira / 2; // Meia entrada
                    System.out.println("Entrada de $" + valorInteira );
                    break;
                } else {
                    System.out.println("Essa criança não se qualifica para meia entrada.");
                    preço = valorInteira; 
                    continue;
                }
                
            case 3:
                System.out.println("Você possui carteira de estudante? (S/N)");
                String resposta = leitor.next();
                if (resposta.equalsIgnoreCase("S")) {
                    preço = valorInteira / 2; // Meia entrada
                    break;
                } else {
                    System.out.println("Você não possui carteira de estudante, por favor selecione outra opção.");
                    preço = valorInteira; // Entrada inteira
                    continue;
                }   
                
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                continue;
            
    

            }

        }
    }
}