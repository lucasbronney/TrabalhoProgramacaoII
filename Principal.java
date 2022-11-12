package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

//classe do tipo Generics
class FilaDeAtendimento<Generics> {

    ArrayList<Generics> objeto = new ArrayList<>();
    //-1 aponta para nenhum elemento da Fila
    int primeiroDaFila = -1, ultimoDaFila = -1;

    // retorna o primeiro elemento da fila
    Generics primeiroDaFila() {
        if (primeiroDaFila == -1) {
            return null;
        }

        return objeto.get(primeiroDaFila);
    }

    // retorna o ultimo elemento da fila
    Generics ultimoDaFila() {

        if (ultimoDaFila == -1) {
            return null;
        }
        return objeto.get(ultimoDaFila);
    }

    // Adiciona elementos na fila
    void enfileirar(Generics X) {
        // se a fila estiver vazia
        if (this.filaVazia()) {
            primeiroDaFila = 0;
            ultimoDaFila = 0;
            objeto.add(X);
        } // se a fila não estiver vazia
        else {
            primeiroDaFila++;
            if (objeto.size() > primeiroDaFila) {

                // move o primeiro elemento para o proximo
                objeto.set(primeiroDaFila, X);
            } else //adiciona elementos na fila
            {
                objeto.add(X);
            }
        }
    }

    // Remove os elementos no final da fila
    void desenfileirar() {
        // se a fila não tiver nenhum elemento
        if (this.filaVazia()) {
            System.out.println("A fila está vazia!");
        } // se a fila tiver apenas um elemento
        else if (primeiroDaFila == ultimoDaFila) {

            // apontando para o mesmo elemento
            primeiroDaFila = ultimoDaFila = -1;
        } else {

            // se a fila tem mais de um elemento incrementa no final da fila
            ultimoDaFila++;
        }
    }

    //Verifica se a fila esta vazia
    boolean filaVazia() {
        // condicão que checa se a fila está vazia como declarado no inicio
        if (primeiroDaFila == -1 && ultimoDaFila == -1) {
            return true;
        }
        return false;
    }

    // Imprime a fila
    @Override
    public String toString() {
        if (this.filaVazia()) {
            return "";
        }

        String Ans = "";

        for (int i = ultimoDaFila; i < primeiroDaFila; i++) {
            System.out.print(i + " - ");
            Ans += String.valueOf(objeto.get(i)) + "\n";
        }

        Ans += String.valueOf(objeto.get(primeiroDaFila));

        return Ans;
    }
}

class Menu {

    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList<Banco> banco = new ArrayList<Banco>();
    public static ArrayList<ContaCorrente> contaCorrentes = new ArrayList<ContaCorrente>();
    public static ArrayList<ContaPoupanca> contaPoupancas = new ArrayList<ContaPoupanca>();
    public static ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();
    public static ArrayList<Curso> cursos = new ArrayList<Curso>();
    public static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    public static ArrayList<Diretor> diretores = new ArrayList<Diretor>();
    public static ArrayList<Faculdade> faculdades = new ArrayList<Faculdade>();
    public static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    public static ArrayList<Presidente> presidente = new ArrayList<Presidente>();

    public static FilaDeAtendimento<Aluno> filaDeAlunos = new FilaDeAtendimento<>();
    public static FilaDeAtendimento<Aluno> filaDeProfessores = new FilaDeAtendimento<>();
    public static FilaDeAtendimento<Coordenador> filaDeCoordenadores = new FilaDeAtendimento<>();
    public static FilaDeAtendimento<PessoaFisica> filaDePessoasFisicas = new FilaDeAtendimento<>();

    public static void menu() {
        System.out.println("\nMenu");
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar");
        System.out.println("2. Consulta Fila de Atendimento");
        System.out.print("Opcao: ");
    }

    public static void cadastrarContas() {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {

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
            System.out.print("Opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:

                    int sair1;
                    int posicao = 0;
                    Scanner lerDados = new Scanner(System.in);

                    do {

                        String nome = JOptionPane.showInputDialog("Digite o Nome");

                        String cpf = JOptionPane.showInputDialog("Digite o CPF");

                        String matricula = JOptionPane.showInputDialog("Digite a Matricula");

                        int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite a Conta"));
                        alunos.add(posicao, new Aluno(cpf, matricula, nome, conta));
                        filaDeAlunos.enfileirar(alunos.get(posicao));
                        posicao++;

                        System.out.print("\nDigite 0 finalizar cadastro de alunos: ");
                        sair1 = lerDados.nextInt();
                        // lerDados.nextLine();
                    } while (sair1 != 0);
                    //lerDados.close();

                    break;

                case 2:
                    int sair2;
                    Scanner lerDados2 = new Scanner(System.in);

                    do {

                        String nomeBanco = JOptionPane.showInputDialog("Digite o Nome do Banco");

                        String nomeFantasia = JOptionPane.showInputDialog("Digite o Nome Fantasia");

                        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ");

                        banco.add(new Banco(nomeBanco, nomeFantasia, cnpj));

                        System.out.print("\nDigite 0 finalizar cadastro do Banco: ");
                        sair2 = lerDados2.nextInt();
                        lerDados2.nextLine();
                    } while (sair2 != 0);
//                    lerDados2.close();

                    break;

                case 3:
                    int sair3;
                    Scanner lerDados3 = new Scanner(System.in);

                    do {
                        String titularContaCorrente = JOptionPane.showInputDialog("Digite o Nome do Titular");

                        contaCorrentes.add(new ContaCorrente(titularContaCorrente));

                        System.out.print("\nDigite 0 finalizar cadastro do Titular da Conta Corrente");
                        sair3 = lerDados3.nextInt();
                        lerDados3.nextLine();
                    } while (sair3 != 0);
//                    lerDados3.close();

                    break;

                case 4:
                    int sair4;
                    Scanner lerDados4 = new Scanner(System.in);

                    do {
                        String titularContaPoupanca = JOptionPane.showInputDialog("Digite o Nome Titular");

                        contaPoupancas.add(new ContaPoupanca(titularContaPoupanca));

                        System.out.print("\nDigite 0 finalizar cadastro do Titular da Conta Poupanca: ");
                        sair4 = entrada.nextInt();
                        entrada.nextLine();
                    } while (sair4 != 0);
//                    lerDados4.close();

                    break;

                case 5:
                    int sair5;
                    int posicao5 = 0;
                    Scanner lerDados5 = new Scanner(System.in);

                    do {

                        String nomeCoordenador = JOptionPane.showInputDialog("Digite o Nome");

                        String cpfCoordenador = JOptionPane.showInputDialog("Digite o CPF");

                        int contaCoordenador = Integer.parseInt(JOptionPane.showInputDialog("Digite a Conta"));

                        coordenadores.add(posicao5, new Coordenador(nomeCoordenador, cpfCoordenador, contaCoordenador));

                        filaDeCoordenadores.enfileirar(coordenadores.get(posicao5));
                        posicao5++;

                        System.out.print("\nDigite 0 finalizar cadastro de coordenadores: ");
                        sair5 = entrada.nextInt();
                        entrada.nextLine();
                    } while (sair5 != 0);
//                    lerDados5.close();
                    break;

                case 6:
                    Scanner lerDados1 = new Scanner(System.in);
                    String nomeDiretor = JOptionPane.showInputDialog("Digite o Nome");

                    String cpfDiretor = JOptionPane.showInputDialog("Digite o CPF");

                    int contaDiretor = Integer.parseInt(JOptionPane.showInputDialog("Digite a Conta"));

                    diretores.add(new Diretor(nomeDiretor, cpfDiretor, contaDiretor));
//                        lerDados1.close();
                    break;

                case 7:
                    int sair7;
                    Scanner lerDados7 = new Scanner(System.in);

                    do {

                        String nomeDisciplina = JOptionPane.showInputDialog("Digite o Nome da Disciplina");

                        String idDisciplina = JOptionPane.showInputDialog("Digite o ID");

                        String salaDisciplina = JOptionPane.showInputDialog("Digite a Sala");

                        int horaInicioDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o Horário de Inicio"));;

                        System.out.print("Hora de fim: ");
                        int horaFimDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o Horário de Encerramento"));;

                        disciplinas.add(new Disciplina(nomeDisciplina, idDisciplina, salaDisciplina, horaInicioDisciplina, horaFimDisciplina));

                        System.out.print("\nDigite 0 finalizar cadastro das disciplinas: ");
                        sair7 = entrada.nextInt();
                        entrada.nextLine();
                    } while (sair7 != 0);
//                    lerDados7.close();
                    break;

                case 8:
                    int sair8;
                    Scanner lerDados8 = new Scanner(System.in);

                    do {

                        String nomeFaculdade = JOptionPane.showInputDialog("Digite o nome da Faculdade");

                        String cnpjFaculdade = JOptionPane.showInputDialog("Digite o CNPJ");

                        faculdades.add(new Faculdade(nomeFaculdade, cnpjFaculdade));

                        System.out.print("\nDigite 0 finalizar cadastro da Faculdade: ");
                        sair8 = entrada.nextInt();
                        entrada.nextLine();
                    } while (sair8 != 0);
//                    lerDados8.close();

                    break;

                case 9:
                    int sair9;
                    Scanner lerDados9 = new Scanner(System.in);

                    do {

                        String nomeGerente = JOptionPane.showInputDialog("Digite o Nome");

                        String cpfGerente = JOptionPane.showInputDialog("Digite o CPF");

                        int contaGerente = Integer.parseInt(JOptionPane.showInputDialog("Digite a Conta"));

                        gerentes.add(new Gerente(nomeGerente, cpfGerente, contaGerente));

                        System.out.print("\nDigite 0 finalizar cadastro de Gerente: ");
                        sair9 = entrada.nextInt();
                        entrada.nextLine();

                    } while (sair9 != 0);
//                    lerDados9.close();

                    break;

                case 10:

                    Scanner lerDados10 = new Scanner(System.in);
                    String nomePresidente = JOptionPane.showInputDialog("Digite o Nome");

                    String cpfPresidente =  JOptionPane.showInputDialog("Digite o CPF");

                    Integer contaGerente = Integer.parseInt(JOptionPane.showInputDialog("Digite a Conta"));

                    presidente.add(new Presidente(nomePresidente, cpfPresidente, contaGerente));
//                        lerDados10.close();
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

    }

    public static void listarFilaDeAtendimento() {
        int i = 0;
        JOptionPane.showMessageDialog(null, "------ Fila de Atendimento de Alunos ------\n" + " - " +  filaDeAlunos + "\n");

    }

}

public class Principal {

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Menu.menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    Menu.cadastrarContas();
                    break;

                case 2:
                    Menu.listarFilaDeAtendimento();
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        System.out.println("");

    }
}
