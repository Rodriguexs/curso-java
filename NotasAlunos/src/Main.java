import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da classe: ");
        int qtdAlunos = leia.nextInt();
        int qtdColunas = 4;
        double matriz[][] = new double[qtdAlunos][qtdColunas];
        String alunos[] = new String[qtdAlunos];
        int mediaAprovado = 6;
        double somaNotas;
        double medias[] = new double[qtdAlunos];
        int opcao = -1;
        boolean encontrado;
        int notaCorrigida;
        double novaNota;


        for(int linha = 0; linha < qtdAlunos; linha++){
            System.out.println("Digite o nome do aluno " + (linha+1) + ": ");
            alunos[linha] = leia.next();
        }

        for (int linha = 0; linha < qtdAlunos; linha++){

            for (int coluna = 0; coluna < qtdColunas; coluna++){
                System.out.println("Digite a nota da prova " + (coluna+1) + " do aluno " + alunos[linha]);
                matriz[linha][coluna] = leia.nextDouble();
            }
        }

        while(opcao != 0){
            System.out.println("1 - Listar todos os alunos");
            System.out.println("2 - Buscar a nota");
            System.out.println("3 - Corrigir nota");
            System.out.println("4 - Limpar tela");
            System.out.println("0 - Encerrar programa");
            opcao = leia.nextInt();


            switch (opcao){
                case 1 :
                    for (int linha = 0; linha < qtdAlunos; linha++){
                        System.out.print(alunos[linha] + ": ");
                        somaNotas = 0;
                        for (int coluna = 0; coluna < qtdColunas; coluna++){
                            System.out.print( " " + matriz[linha][coluna] + " ");
                        }
                        for (int coluna = 0; coluna < qtdColunas; coluna++){
                            somaNotas += matriz[linha][coluna];
                        }
                        somaNotas = somaNotas / qtdColunas;
                        medias[linha] = somaNotas;
                        System.out.print("| Média: " + somaNotas);

                        if (medias[linha] > mediaAprovado){
                        System.out.print(" | Aprovado(a)!");
                        } else {
                            System.out.print(" | Reprovado(a)!");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    System.out.println("Digite o nome do aluno: ");
                    String nomeBusca = leia.next();
                    encontrado = false;
                    for(int linha = 0; linha < qtdAlunos; linha++){
                        if(alunos[linha].equals(nomeBusca)){
                            System.out.println("Notas do aluno " + nomeBusca + ":");
                            for(int coluna = 0; coluna < qtdColunas; coluna++){
                                System.out.println("Nota " + (coluna+1) + ": " + matriz[linha][coluna]);
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Aluno(a) não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeCorrige = leia.next();
                    encontrado = false;
                    for(int linha = 0; linha < qtdAlunos; linha++){
                        if(alunos[linha].equals(nomeCorrige)){
                            System.out.println("Notas do aluno " + nomeCorrige + ":");
                            for(int coluna = 0; coluna < qtdColunas; coluna++){
                                System.out.println("Nota " + (coluna+1) + ": " + matriz[linha][coluna]);
                            }
                            System.out.println("Digite o número da nota que deseja corrigir: ");
                            notaCorrigida = leia.nextInt();
                            System.out.println("Digite a nova nota: ");
                            novaNota = leia.nextDouble();
                            matriz[linha][notaCorrigida-1] = novaNota;
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Aluno não encontrado");
                    }
                    break;
                case 4 :
                    for (int i = 0; i < 50; i++){
                        System.out.println(" ");
                    }
                case 0 :
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }
}