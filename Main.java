import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //public static void main(String[] args){ //encapsulamento de dados
        int op = -1;

        Scanner scan = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<String>();
        
        //criar m�todos 
        do{ 
            System.out.println("Digite 0 para finalizar ou 1 para cadastrar!");
            try{
                op = Integer.parseInt(scan.nextLine());
            }catch (Exception e){
                op = -1;
            }

            switch (op){ // M�todo para exibir na tela 
                case 0:
                    System.out.println("Exibindo nomes...");
                    for ( String aluno: alunos) {
                        System.out.println(aluno);
                    }

                    break;
                case //Organiza��o atrav�s de m�todos que aumentaria a legibilidade, facilita a reutiliza��o de codigo
                        // Organiza��o estruturada
                        //
                         private static void exibeNom() {
                         System.out.println("Exibindo nomes...");
                         for ( String aluno: alunos) {
                         System.out.println(aluno);
                         }
                         
  }
                    private static void dados(){ // Cria��o de m�todo dados 
                    System.out.println("Informe o nome do aluno: ");
                    String aluno = scan.nextLine();
                    if(alunos.contains(aluno)){
                        System.out.println("Aluno já cadastrado");
                    } else {
                        alunos.add(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    }
                    default:
                    break;

                    default:
                    System.out.println("Opção Invalida!");
                    break;
            }
                    }while(op != 0);
    }

}
