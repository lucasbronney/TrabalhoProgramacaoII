package trabalho01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//classe do tipo Generics
class FilaDeAtendimento<Generics>{
    ArrayList <Generics> objeto = new ArrayList<>();
    //-1 aponta para nenhum elemento da Fila
    int primeiroDaFila = -1, ultimoDaFila = -1;

    // retorna o primeiro elemento da fila
    Generics primeiroDaFila()
    {
        if (primeiroDaFila == -1)

            return null;

        return objeto.get(primeiroDaFila);
    }

    // retorna o ultimo elemento da fila
    Generics ultimoDaFila()
    {

        if (ultimoDaFila == -1)
            return null;
        return objeto.get(ultimoDaFila);
    }

    // Adiciona elementos na fila
    void enfileirar(Generics X)
    {
        // se a fila estiver vazia
        if (this.filaVazia()) {
            primeiroDaFila = 0;
            ultimoDaFila = 0;
            objeto.add(X);
        }

        // se a fila não estiver vazia
        else {
            primeiroDaFila++;
            if (objeto.size() > primeiroDaFila) {

                // move o primeiro elemento para o proximo
                objeto.set(primeiroDaFila, X);
            }
            else

                //adiciona elementos na fila
                objeto.add(X);
        }
    }

    // Remove os elementos no final da fila
    void desenfileirar()
    {
        // se a fila não tiver nenhum elemento
        if (this.filaVazia())

            System.out.println("A fila está vazia!");

            // se a fila tiver apenas um elemento
        else if (primeiroDaFila == ultimoDaFila) {

            // apontando para o mesmo elemento
            primeiroDaFila = ultimoDaFila = -1;
        }

        else {

            // se a fila tem mais de um elemento incrementa no final da fila
            ultimoDaFila++;
        }
    }


    //Verifica se a fila esta vazia
    boolean filaVazia()
    {
        // condicão que checa se a fila está vazia como declarado no inicio
        if (primeiroDaFila == -1 && ultimoDaFila == -1)
            return true;
        return false;
    }

    // Imprime a fila
    @Override
    public String toString()
    {
        if (this.filaVazia())
            return "";

        String Ans = "";

        for (int i = ultimoDaFila; i < primeiroDaFila; i++) {
            System.out.print(i + " - ");
            Ans += String.valueOf(objeto.get(i)) + "\n";
        }

        Ans += String.valueOf(objeto.get(primeiroDaFila));

        return Ans;
    }
}
class Menu{
    public static ArrayList <Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList <Banco> banco = new ArrayList<Banco>();
    public static ArrayList <ContaCorrente> contaCorrentes = new ArrayList<ContaCorrente>();
    public static ArrayList <ContaPoupanca> contaPoupancas = new ArrayList<ContaPoupanca>();
    public static ArrayList <Coordenador> coordenadores = new ArrayList<Coordenador>();
    public static ArrayList <Curso> cursos = new ArrayList<Curso>();
    public static ArrayList <Disciplina> disciplinas = new ArrayList<Disciplina>();
    public static ArrayList <Diretor> diretores = new ArrayList<Diretor>();
    public static ArrayList <Faculdade> faculdades = new ArrayList<Faculdade>();
    public static ArrayList <Gerente> gerentes = new ArrayList<Gerente>();
    public static ArrayList <Presidente> presidente = new ArrayList<Presidente>();

    public static FilaDeAtendimento <Aluno> filaDeAlunos = new FilaDeAtendimento<>();
    public static FilaDeAtendimento <Aluno> filaDeProfessores = new FilaDeAtendimento<>();
    public static FilaDeAtendimento <Coordenador> filaDeCoordenadores = new FilaDeAtendimento<>();
    public static FilaDeAtendimento <PessoaFisica> filaDePessoasFisicas = new FilaDeAtendimento<>();



    public static void menu (){
        System.out.println("\nMenu");
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar");
        System.out.println("2. Consulta Fila de Atendimento");
        System.out.print ("Opcao: " );
    }

    public static void cadastrarContas (){

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("------------------------------");
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar Alunos");
            System.out.println("2. Cadastrar Banco");
            System.out.println("3. Cadastrar Conta Corrente");
            System.out.println("4. Cadastrar Conta Poupanca");
            System.out.println("5. Cadastrar Coordenador");
            System.out.println("6. Cadastrar Diretor");
            System.out.println("7. Cadastrar Disciplina");
            System.out.println("8. Cadastrar Faculdade");
            System.out.println("9. Cadastrar Gerente");
            System.out.println("10. Cadastrar Presidente");
            System.out.print ("Opcao: " );

            opcao = entrada.nextInt();

            switch(opcao){
                case 1:

                    int sair1;
                    int posicao = 0;
                    Scanner lerDados = new Scanner(System.in);

                    do {

                        System.out.print ("Nome do Aluno: ");
                        String nome = lerDados.nextLine();

                        System.out.print ("CPF: ");
                        String cpf = lerDados.nextLine();

                        System.out.print ("Matricula: ");
                        Integer matricula = lerDados.nextInt();

                        System.out.print ("Conta: ");
                        Integer conta = lerDados.nextInt();
                        alunos.add(posicao, new Aluno(cpf, matricula, nome, conta));

                        filaDeAlunos.enfileirar(alunos.get(posicao));
                        posicao++;

                        System.out.print ("\nDigite 0 finalizar cadastro de alunos: " );
                        sair1 = entrada.nextInt();
                    }while (sair1 != 0);
//                    lerDados.close();

                    break;

                case 2:
                    int sair2;
                    Scanner lerDados2 = new Scanner(System.in);

                    do {

                        System.out.print ("Nome do Banco: ");
                        String nomeBanco = lerDados2.nextLine();

                        System.out.print ("Nome Fantasia: ");
                        String nomeFantasia = lerDados2.nextLine();

                        System.out.print ("CNPJ: ");
                        String cnpj = lerDados2.nextLine();

                        banco.add(new Banco(nomeBanco, nomeFantasia, cnpj));

                        System.out.print ("\nDigite 0 finalizar cadastro do Banco: " );
                        sair2 = entrada.nextInt();
                    }while (sair2 != 0);
//                    lerDados2.close();

                    break;

                case 3:
                    int sair3;
                    Scanner lerDados3 = new Scanner(System.in);

                    do {
                        System.out.print ("Nome do Titular da Conta: ");
                        String titularContaCorrente = lerDados3.nextLine();

                        contaCorrentes.add(new ContaCorrente(titularContaCorrente));

                        System.out.print ("\nDigite 0 finalizar cadastro do Titular da Conta Corrente: " );
                        sair3 = entrada.nextInt();
                    }while (sair3 != 0);
//                    lerDados3.close();

                    break;

                case 4:
                    int sair4;
                    Scanner lerDados4 = new Scanner(System.in);

                    do {
                        System.out.print ("Nome do Titular da Conta Poupança: ");
                        String titularContaPoupanca = lerDados4.nextLine();

                        contaPoupancas.add(new ContaPoupanca(titularContaPoupanca));

                        System.out.print ("\nDigite 0 finalizar cadastro do Titular da Conta Poupanca: " );
                        sair4 = entrada.nextInt();
                    }while (sair4 != 0);
//                    lerDados4.close();

                    break;

                case 5:
                    int sair5;
                    int posicao5 = 0;
                    Scanner lerDados5 = new Scanner(System.in);

                    do {

                        System.out.print ("Nome do Coordenador: ");
                        String nomeCoordenador = lerDados5.nextLine();

                        System.out.print ("CPF: ");
                        String cpfCoordenador = lerDados5.nextLine();

                        System.out.print ("Conta: ");
                        Integer contaCoordenador = lerDados5.nextInt();

                        coordenadores.add(posicao5, new Coordenador(nomeCoordenador, cpfCoordenador, contaCoordenador));

                        filaDeCoordenadores.enfileirar(coordenadores.get(posicao5));
                        posicao5++;

                        System.out.print ("\nDigite 0 finalizar cadastro de coordenadores: " );
                        sair5 = entrada.nextInt();
                    }while (sair5 != 0);
//                    lerDados5.close();
                    break;

                case 6:
                    Scanner lerDados1 = new Scanner(System.in);
                    System.out.print ("Nome do Diretor: ");
                    String nomeDiretor = lerDados1.nextLine();

                    System.out.print ("CPF: ");
                    String cpfDiretor = lerDados1.nextLine();

                    System.out.print ("Conta: ");
                    Integer contaDiretor = lerDados1.nextInt();

                    diretores.add(new Diretor(nomeDiretor, cpfDiretor, contaDiretor));
//                        lerDados1.close();
                    break;

                case 7:
                    int sair7;
                    Scanner lerDados7 = new Scanner(System.in);

                    do {

                        System.out.print ("Nome da Disciplina: ");
                        String nomeDisciplina = lerDados7.nextLine();

                        System.out.print ("Nome Id da Disciplina: ");
                        String idDisciplina = lerDados7.nextLine();

                        System.out.print ("Sala: ");
                        String salaDisciplina = lerDados7.nextLine();

                        System.out.print ("Hora de inicio: ");
                        Integer horaInicioDisciplina = lerDados7.nextInt();

                        System.out.print ("Hora de fim: ");
                        Integer horaFimDisciplina = lerDados7.nextInt();

                        disciplinas.add(new Disciplina(nomeDisciplina, idDisciplina, salaDisciplina, horaInicioDisciplina, horaFimDisciplina));

                        System.out.print ("\nDigite 0 finalizar cadastro das disciplinas: " );
                        sair7 = entrada.nextInt();
                    }while (sair7 != 0);
//                    lerDados7.close();
                    break;

                case 8:
                    int sair8;
                    Scanner lerDados8 = new Scanner(System.in);

                    do {

                        System.out.print ("Nome da Faculdade: ");
                        String nomeFaculdade = lerDados8.nextLine();

                        System.out.print ("CNPJ: ");
                        String cnpjFaculdade = lerDados8.nextLine();

                        faculdades.add(new Faculdade(nomeFaculdade, cnpjFaculdade));

                        System.out.print ("\nDigite 0 finalizar cadastro da Faculdade: " );
                        sair8 = entrada.nextInt();
                    }while (sair8 != 0);
//                    lerDados8.close();

                    break;

                case 9:
                    int sair9;
                    Scanner lerDados9 = new Scanner(System.in);

                    do {

                        System.out.print ("Nome do Diretor: ");
                        String nomeGerente = lerDados9.nextLine();

                        System.out.print ("CPF: ");
                        String cpfGerente = lerDados9.nextLine();

                        System.out.print ("Conta: ");
                        Integer contaGerente = lerDados9.nextInt();

                        gerentes.add(new Gerente(nomeGerente, cpfGerente, contaGerente));

                        System.out.print ("\nDigite 0 finalizar cadastro de Gerente: " );
                        sair9 = entrada.nextInt();

                    }while (sair9 != 0);
//                    lerDados9.close();

                    break;

                case 10:

                    Scanner lerDados10 = new Scanner(System.in);
                    System.out.print ("Nome do Presidente: ");
                    String nomePresidente = lerDados10.nextLine();

                    System.out.print ("CPF: ");
                    String cpfPresidente = lerDados10.nextLine();

                    System.out.print ("Conta: ");
                    Integer contaGerente = lerDados10.nextInt();

                    presidente.add(new Presidente(nomePresidente, cpfPresidente, contaGerente));
//                        lerDados10.close();
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while(opcao != 0);

    }


    public static void listarFilaDeAtendimento (){
        int i = 0;
        System.out.println("------ Fila de Atendimento de Alunos ------\n" + " - " + filaDeAlunos + "\n");
    }

}
public class Principal {

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do{
            Menu.menu();
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    Menu.cadastrarContas();
                    break;

                case 2:
                    Menu.listarFilaDeAtendimento();
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while(opcao != 0);

        System.out.println("");

    }



}


