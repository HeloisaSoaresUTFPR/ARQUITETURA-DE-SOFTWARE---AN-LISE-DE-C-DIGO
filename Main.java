import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //public static void main(String[] args){ //encapsulamento de dados
        int op = -1;

        Scanner scan = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<String>();
        
        //criar métodos 
        do{ 
            System.out.println("Digite 0 para finalizar ou 1 para cadastrar!");
            try{
                op = Integer.parseInt(scan.nextLine());
            }catch (Exception e){
                op = -1;
            }

            switch (op){ // Método para exibir na tela 
                case 0:
                    System.out.println("Exibindo nomes...");
                    for ( String aluno: alunos) {
                        System.out.println(aluno);
                    }

                    break;
                case //Organização através de métodos que aumentaria a legibilidade, facilita a reutilização de codigo
                        // Organização estruturada
                        //
                         private static void exibeNom() {
                         System.out.println("Exibindo nomes...");
                         for ( String aluno: alunos) {
                         System.out.println(aluno);
                         }
                         
  }
                    private static void dados(){ // Criação de método dados 
                    System.out.println("Informe o nome do aluno: ");
                    String aluno = scan.nextLine();
                    if(alunos.contains(aluno)){
                        System.out.println("Aluno jÃ¡ cadastrado");
                    } else {
                        alunos.add(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    }
                    default:
                    break;

                    default:
                    System.out.println("OpÃ§Ã£o Invalida!");
                    break;
            }
                    }while(op != 0);
    }

}
