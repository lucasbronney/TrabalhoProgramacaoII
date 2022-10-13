package trabalho01;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

//classe do tipo Generics
 class FilaDeAtendimento<T>{
    ArrayList <T> objeto = new ArrayList<>();
    //-1 aponta para nenhum elemento da Fila
    int primeiroDaFila = -1, ultimoDaFila = -1;

    // retorna o primeiro elemento da fila
    T primeiroDaFila()
    {
        if (primeiroDaFila == -1)

            return null;

        return objeto.get(primeiroDaFila);
    }

    // retorna o ultimo elemento da fila
    T ultimoDaFila()
    {

        if (ultimoDaFila == -1)
            return null;
        return objeto.get(ultimoDaFila);
    }

    // Adiciona elementos na fila
    void enfileirar(T X)
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
            Ans += String.valueOf(objeto.get(i)) + ", ";
        }

        Ans += String.valueOf(objeto.get(primeiroDaFila));

        return Ans;
    }
}

public class Principal {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno ("111.222.333-44", 20221011, "Joao", 11111-1);
        Aluno aluno2 = new Aluno ("111.222.333-55", 20221012, "Marcos", 22222-1);
        Aluno aluno3 = new Aluno ("111.222.333-66", 20221013, "Paulo", 33333-1);

        Gerente gerente1 = new Gerente("111.111.111-11", "Francisco", 44444-1);
        Diretor diretor1 = new Diretor("111.111.111-11", "Francisco", 44444-1);
        Coordenador coordenador1 = new Coordenador("111.111.111-11", "Francisco", 44444-1);

        Curso curso1 = new Curso("Computacao", "1234", 6);

        Faculdade faculdade1 = new Faculdade("Estacio", "111.111.1111-11");

        Banco banco1 = new Banco();
        banco1.setNome("Banco do Brasil S/A");
        banco1.setCnpj("111.111.1111-11");
        banco1.setNomefantasia("Banco do Brasil");

        FilaDeAtendimento <String> filaDeAlunos = new FilaDeAtendimento<>();
        filaDeAlunos.enfileirar(aluno1.getNome());
        filaDeAlunos.enfileirar(aluno2.getNome());
        filaDeAlunos.enfileirar(aluno3.getNome());

        System.out.println("Fila de alunos: " + filaDeAlunos);

        System.out.println("");
        }



    }


