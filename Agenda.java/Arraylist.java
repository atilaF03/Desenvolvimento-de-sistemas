
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> list = new ArrayList<>();

        int op = 0;

        while (op != 4) {
            System.out.println("\n:::::::::Menu:::::::::");
            System.out.println("1 cadastrar");
            System.out.println("2 lista");
            System.out.println("3 remover");
            System.out.println("4 sair");
            System.out.println("escolha a opção ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.println("digite um nome ");
                    String nome = sc.nextLine();

                    System.out.println("digite um telefone");
                    String telefone = sc.nextLine();
                    list.add(new Pessoa(telefone, nome));

                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("lista vazia ");

                    } else {

                        for (Pessoa p : list) {
                            System.out.println("nome: " + p.getNome());
                            System.out.println("telefone: " + p.getTelefone());

                        }
                    }

                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("a lista esta vazia");
                    } else {
                        System.out.println("Digite um indice a ser removido");
                        int indice = sc.nextInt();
                        if (indice >= 0 && indice < list.size()) {
                            list.remove(indice);
                            System.out.println("contato removido com sucesso");

                        }
                    }

                    break;
                default:
                    break;
            }

        }
        sc.close();
    }
}
